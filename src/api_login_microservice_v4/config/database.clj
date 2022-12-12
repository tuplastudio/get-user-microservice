(ns  api-login-microservice-v4.config.database
  (:use [korma.db :only [defdb postgres]])
  (:require [clojure.java.io :as io]
            [dotenv :refer [env app-env]]
            [clojure.java.jdbc :as jdbc]))

(defdb db (postgres {:db ""
                     :user ""
                     :host ""
                     :password ""}))
