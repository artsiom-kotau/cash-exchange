(ns by.cash-exchange.tm-proxy-service.util.task.api)

(defprotocol Task
  (create [this])
  (schedule [this fn delay each time-unit])
  (shutdown [this]))
