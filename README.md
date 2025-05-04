# DSWSC
Dead Simple Websocket Client (DSWSC), lets you send and 
receive data from websocket endpoints as strings.

# usage 
pre built binaries can be found [here](https://github.com/foldcat/dswsc/releases)
1. build/download binaries 
2. execute
```bash 
binaryname wss://ws.postman-echo.com/raw
```
3. upon connecting, you will see a log
4. type your message and press enter to send 
5. wait for reply

# building

## build jar 
```bash 
clj -T:build clean
clj -T:build uber # jar will be located at /target
java -jar target/dswsc-[insert version]-standalone.jar wss://ws.postman-echo.com/raw # execute
```

## graalvm native image 
```bash 
# has better startup speed
native-image --initialize-at-build-time --no-server -jar target/dswsc-[insert version]-standalone.jar -H:Name=target/dswsc
```

## run without building
```bash
# warning: slower startup time
clj -M -m dswsc.core wss://ws.postman-echo.com/raw
```

