(ns api-login-microservice-v4.routes.general
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [schema.core :as s]
            [api-login-microservice-v4.config.swagger :as swagger-conf]))

(def routes-general
  (context "/api/v1" []
           :tags ["api"]
           (GET "/health-check"
                []
                :return  {:result String}
                :responses
                         {204 {:description "App run ok!"}
                          404 {:description "Not found services"}}
                :summary "Health check services"
                (ok {:result "Process is ok!"}))))
