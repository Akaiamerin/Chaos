import { join } from 'node:path';
import { app, BrowserWindow, Menu } from 'electron';
Menu.setApplicationMenu(null);
function createWindow() {
    const mainWindow = new BrowserWindow({
        width: 800,
        height: 600,
        webPreferences: {
            preload: join(__dirname, 'preload.js')
        }
    });
    mainWindow.loadFile(join(__dirname, 'index.html'));
    mainWindow.webContents.openDevTools();
}
app.whenReady().then(() => {
    createWindow();
    app.on('activate', () => {
        if (BrowserWindow.getAllWindows().length === 0) {
            createWindow();
        }
    });
});
app.on('window-all-closed', () => {
    if (process.platform !== 'darwin') {
        app.quit();
    }
});