@echo off

%1 mshta vbscript:CreateObject("Shell.Application").ShellExecute("cmd.exe","/c %~s0 ::","","runas",1)(window.close)&&exit

cd /d %~dp0

set instl_path="D:\Code"
setx /m JAVA_HOME "%instl_path%\jdk-17" 1>NUL 2>NUL
setx /m CLASSPATH ".;%%JAVA_HOME%%\lib\dt.jar;%%JAVA_HOME%%\lib\tools.jar" 1>NUL 2>NUL
setx /m Path "%Path%;%%JAVA_HOME%%\bin;%%JAVA_HOME%%\jre\bin" 1>NUL 2>NUL