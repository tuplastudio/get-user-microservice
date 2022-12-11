(ns api-login-microservice-v4.routes.user-router
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [api-login-microservice-v4.entity.user-entity :as user-entity]
            [api-login-microservice-v4.controllers.user-controller
             :as
             user_controller]))


(def user-routes
  (context "/users" [] :tags ["api-users"]
           (GET "/" []
                :summary "Get all available users"
                :return  [user-entity/user-schema]
                :responses
                         {200 {:schema      [user-entity/user-schema],
                               :description "List of users"}}
                (user_controller/get-all-users))))