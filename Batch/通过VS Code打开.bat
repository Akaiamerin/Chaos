@echo off

%1 mshta vbscript:CreateObject("Shell.Application").ShellExecute("cmd.exe","/c %~s0 ::","","runas",1)(window.close)&&exit

cd /d %~dp0

reg add "HKEY_CLASSES_ROOT\*\shell\VS Code" /ve /t REG_SZ /d "通过VS Code打开" /f 1>NUL 2>NUL
reg add "HKEY_CLASSES_ROOT\*\shell\VS Code" /v "Icon" /t REG_SZ /d "D:\Code\VS Code\Code.exe" /f 1>NUL 2>NUL
reg add "HKEY_CLASSES_ROOT\*\shell\VS Code\command" /ve /t REG_SZ /d "\"D:\Code\VS Code\Code.exe\"\"%%1\"" /f 1>NUL 2>NUL
reg add "HKEY_CLASSES_ROOT\Directory\shell\V SCode" /ve /t REG_SZ /d "通过VS Code打开" /f 1>NUL 2>NUL
reg add "HKEY_CLASSES_ROOT\Directory\shell\V SCode" /v "Icon" /t REG_SZ /d "D:\Code\VS Code\Code.exe" /f 1>NUL 2>NUL
reg add "HKEY_CLASSES_ROOT\Directory\shell\V SCode\command" /ve /t REG_SZ /d "\"D:\Code\VS Code\Code.exe\"\"%%V\"" /f 1>NUL 2>NUL