# DSWSC
Dead Simple Websocket Client (DSWSC), lets you send and 
receive data from websocket endpoints as strings.

# usage

## build jar 
```bash 
clj -T:build clean
clj -T:build uber # jar will be located at /target
java -jar target/dswsc-[insert version]-standalone.jar wss://ws.postman-echo.com/raw # execute
```

## run without building
```bash
# warning: slower startup time
clj -M -m dswsc.core wss://ws.postman-echo.com/raw
```

