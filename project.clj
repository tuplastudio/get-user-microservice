 (defproject api-login-microservice-v4 "0.1.0-SNAPSHOT"
   :description "FIXME: write description"
   :dependencies [[org.clojure/clojure "1.10.0"]
                  [compojure "1.7.0"] ; routing library
                  [org.clojure/tools.logging "1.2.4"] ; log library
                  [korma "0.5.0-RC1"] ; orm
                  [metosin/compojure-api "2.0.0-alpha30"]]
   :ring {:handler api-login-microservice-v4.handler/app}
   :uberjar-name "server.jar"
   :profiles {:dev {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]]
                   :plugins [[lein-ring "0.12.5"]]}})
