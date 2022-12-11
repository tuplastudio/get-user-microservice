(ns api-login-microservice-v4.handler
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            ;[api-login-microservice-v4.config.routes :as routes]
            [api-login-microservice-v4.routes.general :as general_routes]
            [api-login-microservice-v4.config.swagger :as swagger_config]))

(def app
  (api
   swagger_config/swagger-routes
   ;routes/document-routes
   general_routes/routes-general))
