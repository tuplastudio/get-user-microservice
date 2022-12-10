(ns api-login-microservice-v4.config.routes
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [schema.core :as s]
            [api-login-microservice-v4.config.swagger :as swagger-conf]))


(s/defschema Pizza
  {:name                         s/Str
   (s/optional-key :description) s/Str
   :size                         (s/enum :L :M :S)
   :origin                       {:country (s/enum :FI :PO)
                                  :city    s/Str}})

(def document-routes
  (context "/api" []
           :tags ["api"]

           (GET "/plus" []
                :return       {:result Long}
                :query-params [x :- Long, y :- Long]
                :summary      "adds two numbers together"
                (ok {:result (+ x y)}))

           (POST "/echo" []
                 :return  Pizza
                 :body    [pizza Pizza]
                 :summary "echoes a Pizza"
                 (ok pizza))))


(def app-routes
  swagger-conf/swagger-routes)
