(ns api-login-microservice-v4.config.routes
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [schema.core :as s]
            [api-login-microservice-v4.config.swagger :as swagger-conf]))


(def document-routes
  (context "/api" []
           :tags ["api"]

           (GET "/plus" []
                :return       {:result Long}
                :query-params [x :- Long, y :- Long]
                :summary      "adds two numbers together"
                (ok {:result (+ x y)}))

           (GET "/health-check"
                []
                :return {:result String}
                :summary "Health check services"
                (ok {:result "Process is ok!"})
             )
           ))

