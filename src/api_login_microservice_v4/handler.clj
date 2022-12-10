(ns api-login-microservice-v4.handler
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [api-login-microservice-v4.config.routes :as routes]
            [api-login-microservice-v4.config.swagger :as swagger_config]
            [schema.core :as s]))

(s/defschema Pizza
  {:name s/Str
   (s/optional-key :description) s/Str
   :size (s/enum :L :M :S)
   :origin {:country (s/enum :FI :PO)
            :city s/Str}})

(def app
  (api
    swagger_config/swagger-routes
    routes/document-routes
   ))
