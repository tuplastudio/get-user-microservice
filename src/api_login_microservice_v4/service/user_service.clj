(ns api-login-microservice-v4.service.user-service
  (:require [clojure.java.jdbc :as jdbc]
            [clojure.tools.logging :as log]
            [api-login-microservice-v4.entity.user-entity :as user]
            ;[clojure-rest.config.database :as database]
            [api-login-microservice-v4.repository.user-repository :as user-repository]))

(defn uuid [] (str (java.util.UUID/randomUUID)))

(defn get-all-users
  "Get all documents from the database"
  []
  (user-repository/get-all-users))