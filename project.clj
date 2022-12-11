 (defproject api-login-microservice-v4 "0.1.0-SNAPSHOT"
   :description "FIXME: write description"
   :dependencies [[org.clojure/clojure "1.10.0"]
                  [compojure "1.7.0"] ; routing library
                  [org.clojure/tools.logging "1.2.4"] ; log library
                  [korma "0.5.0-RC1"] ; orm
                  [org.clojure/java.jdbc "0.7.1"] ; jdbc support
                  [cheshire "5.11.0"] ; Json parsing librairy
                  [jarohen/nomad "0.9.1"] ; configuration handling library
                  [prismatic/schema "1.4.1"] ; bean validation equivalent for clojure
                  [ragtime "0.8.1"] ; migration utility
                  [ring/ring-json "0.5.1"] ; ring server json support
                  [ring/ring-defaults "0.3.4"] ; ring server default dependencies
                  [metosin/compojure-api "2.0.0-alpha30"]]
   :ring {:handler api-login-microservice-v4.handler/app}
   :uberjar-name "server.jar"
   :profiles {:dev {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]]
                   :plugins [[lein-ring "0.12.5"]]}})
