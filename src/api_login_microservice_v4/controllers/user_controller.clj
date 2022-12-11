(ns api-login-microservice-v4.controllers.user-controller
  (:use [ring.util.response :only [response]])
  (:require [compojure.core :refer :all]
            [ring.util.http-response :refer :all]
            [compojure.route :as route]
            [clojure.java.jdbc :as jdbc]
            [clojure.tools.logging :as log]
            [ring.middleware.json :as ring-json]
            [api-login-microservice-v4.service.user-service :as user-service]
            [api-login-microservice-v4.config.database :as database]))

(defn get-all-users []
  (log/info "get-all-users")
  (response
   (user-service/get-all-users)))