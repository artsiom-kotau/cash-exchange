(ns by.cash-exchange.api.api
  (:require
    [compojure.core :refer :all]))

(defroutes app-routes
           ; find best exchange rate. Return collection (address, coordinates, name, exchange rate, total sum)
           ;Could be ordered by destination
           ;by default returns 10 best
           (GET "api/best" [])
           ; find closest exchange office. Return collection (address, coordinates, name, exchange rate, total sum)
           ;Could be ordered by total sum
           ;by default returns 10 closest
           (GET "api/closest" [])
           ; find optimal - closest. Return collection (address, coordinates, name, exchange rate, total sum)
           ;Could be ordered by total sum
           ;by default returns 10 optimal
           (GET "api/optimal" []))
