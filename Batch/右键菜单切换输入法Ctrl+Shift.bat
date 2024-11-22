@echo off
%1 mshta vbscript:CreateObject("Shell.Application").ShellExecute("cmd.exe","/c %~s0 ::","","runas",1)(window.close)&&exit
cd /d %~dp0

reg add "HKEY_CLASSES_ROOT\Directory\Background\shell\SwitchInputMethod" /ve /t REG_SZ /d "切换输入法Ctrl+Shift" /f 1>NUL 2>NUL
reg add "HKEY_CLASSES_ROOT\Directory\Background\shell\SwitchInputMethod\command" /ve /t REG_SZ /d "cmd.exe /c reg add \"HKEY_CURRENT_USER\Keyboard Layout\Toggle\" /v \"Language Hotkey\" /t REG_SZ /d \"2\" /f 1>NUL 2>NUL & reg add \"HKEY_CURRENT_USER\Keyboard Layout\Toggle\" /v \"Hotkey\" /t REG_SZ /d \"2\" /f 1>NUL 2>NUL & reg add \"HKEY_CURRENT_USER\Keyboard Layout\Toggle\" /v \"Layout Hotkey\" /t REG_SZ /d \"3\" /f 1>NUL 2>NUL" /f 1>NUL 2>NUL