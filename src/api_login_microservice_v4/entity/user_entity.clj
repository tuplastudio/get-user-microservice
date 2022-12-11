(ns api-login-microservice-v4.entity.user-entity
  (:use [korma.core :only [defentity table entity-fields pk]])
  (:require [clojure.tools.logging :as log]
            [schema.core :as schema]))

; -- Korma configuration
(defentity user
  (table :users) ; Associated table
  (pk :id) ; primary key
  (entity-fields :first_name :last_name :email :id)) ; Default field for select

; -- Validation schema for complete document
(def user-schema
  {:first_name schema/Str
   :last_name schema/Str
   :email schema/Str
   :id schema/Int})

; -- Validation for input rest document
(def user-schema-rest-in
  {:first_name schema/Str
   :last_name schema/Str})
