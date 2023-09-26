@echo off
%1 mshta vbscript:CreateObject("Shell.Application").ShellExecute("cmd.exe","/c %~s0 ::","","runas",1)(window.close)&&exit
cd /d %~dp0

reg add "HKEY_CLASSES_ROOT\Directory\Background\shell\SwitchInputMethod" /ve /t REG_SZ /d "切换输入法 Ctrl + Shift" /f 1>NUL 2>NUL
reg add "HKEY_CLASSES_ROOT\Directory\Background\shell\SwitchInputMethod\command" /ve /t REG_SZ /d "D:\切换输入法Ctrl+Shift.bat /s /k pushd \"%V\"" /f 1>NUL 2>NUL