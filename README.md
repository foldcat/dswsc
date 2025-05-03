# DSWSC
Dead Simple Websocket Client (DSWSC), lets you send and 
receive data from websocket endpoints as strings.

# usage
```bash
# step 1: launch
clj -M -m dswsc.core wss://ws.postman-echo.com/raw
# step 2: wait for connect message 
# step 3: type message you want to send and press enter 
# step 4: receive reply
```
