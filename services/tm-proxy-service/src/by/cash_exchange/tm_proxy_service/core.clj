(ns by.cash-exchange.tm-proxy-service.core
  (:require
    [by.cash-exchange.tm-proxy-service.tm-service :as tm-service]
    [ring.adapter.jetty :as jetty]
    [compojure.handler :as handler]
    [clojure.tools.logging :as log]))


(defn -main
  [& args]
  (let [port (Integer/parseInt (or (System/getenv "PORT") "8080"))]
    (jetty/run-jetty (handler/site tm-service/app-routes) {:port port})
    (log/info (str "Running webserver at http:/127.0.0.1:" port "/"))))