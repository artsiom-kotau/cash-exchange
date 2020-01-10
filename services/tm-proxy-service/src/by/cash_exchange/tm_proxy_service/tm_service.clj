(ns by.cash-exchange.tm-proxy-service.tm-service
  (:require
    [compojure.core :refer :all]
    [compojure.route :as route]
    [clojure.tools.logging :as log]))

(defn handle-webhook [request]
  (log/infof "Request: '%s'" request)
  {:status  200
   :headers {"Content-Type" "application/json"}
   :body    "Ok"})

(defroutes app-routes
           (GET "/tm/cash-exchange/webhook" [] handle-webhook)
           (route/not-found "Error, page not found!"))





