(ns by.cash-exchange.tm-proxy-service.util.task.scheduler-test
  (:require [by.cash-exchange.tm-proxy-service.util.task.scheduler :as scheduler]
            [clojure.test :refer :all]))

(deftest create-scheduler
         (let [sched (scheduler/do-create-scheduler {} scheduler/core-size)]
           (scheduler/do-shutdown sched)))
