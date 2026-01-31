import { join } from 'node:path';
import { fileURLToPath, URL } from 'node:url';
import { app, BrowserWindow, Menu } from 'electron';
Menu.setApplicationMenu(null);
function createWindow(): void {
    const __dirname: string = fileURLToPath(new URL('./', import.meta.url));
    const mainWindow: BrowserWindow = new BrowserWindow({
        width: 800,
        height: 600,
        webPreferences: {
            preload: join(__dirname, 'preload.js')
        }
    });
    if (DIST_VITE_DEV_SERVER_URL) {
        mainWindow.loadURL(DIST_VITE_DEV_SERVER_URL);
        mainWindow.webContents.openDevTools();
    }
    else {
        mainWindow.loadFile(join(__dirname, '..', 'renderer', DIST_VITE_NAME, 'index.html'));
    }
};
app.whenReady().then((): void => {
    createWindow();
    app.on('activate', (): void => {
        if (BrowserWindow.getAllWindows().length === 0) {
            createWindow();
        }
    });
});
app.on('window-all-closed', (): void => {
    if (process.platform !== 'darwin') {
        app.quit();
    }
});