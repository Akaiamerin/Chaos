@echo off

%1 mshta vbscript:CreateObject("Shell.Application").ShellExecute("cmd.exe","/c %~s0 ::","","runas",1)(window.close)&&exit

cd /d %~dp0

set instl_path="D:\Code"
setx /m Path "%Path%;%instl_path%\Git\cmd;%instl_path%\Git\usr\bin" 1>NUL 2>NUL