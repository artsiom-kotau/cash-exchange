(defproject tm-proxy-service "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [org.slf4j/slf4j-api "1.7.30"]
                 [org.clojure/tools.logging "0.5.0"]
                 [org.apache.logging.log4j/log4j-core "2.13.0"]
                 [org.apache.logging.log4j/log4j-api "2.13.0"]
                 [org.apache.logging.log4j/log4j-slf4j-impl "2.13.0"]
                 [org.clojure/data.json "0.2.7"]
                 [ring/ring-jetty-adapter "1.8.0"]
                 [ring/ring-defaults "0.3.2"]]
  :main ^:skip-aot by.cash-exchange.tm-proxy-service.core
  :uberjar-name "tm-proxy-service.jar"
  :repl-options {:init-ns tm-proxy-service.core})
