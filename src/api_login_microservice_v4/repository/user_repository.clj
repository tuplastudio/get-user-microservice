(ns api-login-microservice-v4.repository.user-repository
  (:use [korma.core :only [select insert values delete where set-fields]])
  (:require [clojure.tools.logging :as log]
            [api-login-microservice-v4.entity.user-entity :as user-entity]))


(defn get-all-users
  "Get all users from the database"
  []
  (select user-entity/user))
