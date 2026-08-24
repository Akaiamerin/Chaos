@echo off
%1 mshta vbscript:CreateObject("Shell.Application").ShellExecute("cmd.exe","/c %~s0 ::","","runas",1)(window.close)&&exit
cd /d %~dp0

@REM setx /m Path "%Path%;D:\Code\MinGW-w64\bin" 1>NUL 2>NUL

@REM setx /m JAVA_HOME "D:\Code\jdk\jdk-17" 1>NUL 2>NUL
@REM setx /m CLASSPATH ".;%%JAVA_HOME%%\lib\dt.jar;%%JAVA_HOME%%\lib\tools.jar" 1>NUL 2>NUL
@REM setx /m Path "%Path%;%%JAVA_HOME%%\bin;%%JAVA_HOME%%\jre\bin" 1>NUL 2>NUL

@REM setx /m Path "%Path%;D:\Code\Git\usr\bin" 1>NUL 2>NUL