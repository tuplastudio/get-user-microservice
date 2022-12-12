(ns  api-login-microservice-v4.config.database
  (:use [korma.db :only [defdb postgres]])
  (:require [clojure.java.io :as io]
            [dotenv :refer [env app-env]]
            [clojure.java.jdbc :as jdbc]))

(defdb db (postgres {:db (env :DB_NAME)
                     :user (env :DB_USER)
                     :port (Integer/parseInt(env :DB_PORT))
                     :host (env :DB_HOST)
                     :password (env :DB_PASS)}))
