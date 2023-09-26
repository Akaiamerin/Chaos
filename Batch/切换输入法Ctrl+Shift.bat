@echo off
%1 mshta vbscript:CreateObject("Shell.Application").ShellExecute("cmd.exe","/c %~s0 ::","","runas",1)(window.close)&&exit
cd /d %~dp0

reg add "HKEY_CURRENT_USER\Keyboard Layout\Toggle" /v "Language Hotkey" /t REG_SZ /d "2" /f 1>NUL 2>NUL
reg add "HKEY_CURRENT_USER\Keyboard Layout\Toggle" /v "Hotkey" /t REG_SZ /d "2" /f 1>NUL 2>NUL
reg add "HKEY_CURRENT_USER\Keyboard Layout\Toggle" /v "Layout Hotkey" /t REG_SZ /d "3" /f 1>NUL 2>NUL