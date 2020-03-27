(ns by.cash-exchange.tm-proxy-service.util.task.scheduler
  (:require [by.cash-exchange.tm-proxy-service.util.task.api :as task.api])
  (:import [java.util.concurrent Executors]))

(def core-size 5)

(defn- do-create-scheduler [this core-size]
    (assoc this :executor-pool (. Executors (newScheduledThreadPool core-size))))

(defn- do-schedule [this fn delay each unit]
  (.scheduleAtFixedRate (:executor-pool this)
                        (cast Runnable fn)
                        delay
                        each
                        unit))

(defn- do-shutdown [this]
  (.shutdown (:executor-pool this)))

(defrecord JavaScheduler []
  task.api/Task
  (create [this]
    (do-create-scheduler this core-size))
  (schedule [this fn delay each unit]
    (do-schedule this fn delay each unit))
  (shutdown [this]
    (do-shutdown this)))


