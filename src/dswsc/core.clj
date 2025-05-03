(ns dswsc.core
  (:require [hato.websocket :as ws]
            [taoensso.timbre :as log]))

(defn -main [& args]
  (log/info "connecting to" (first args))
  (let [websocket
        @(ws/websocket
          (first args)
          {:on-message (fn [_ws msg _last?]
                         (log/info "received \n" (.toString msg)))
           :on-close (fn [_ws _status _reason]
                       (log/info "websocket closed")
                       (System/exit 0))})]
    (log/info "connected, accepting input now")
    (loop []
      (try
        (let [line (read-line)]
          (ws/send! websocket line))
        (catch Exception e
          (log/error (str "caught exception" (.getMessage e)))))
      (recur))))
