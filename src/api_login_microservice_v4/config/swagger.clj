(ns api-login-microservice-v4.config.swagger)

(def swagger-routes
  {:swagger
   {:ui "/"
    :spec "/swagger.json"
    :data {:info {:title "Login Microservices"
                  :description "This microservices is to login into the app"}
           :tags [{:name "api-sing in", :description "Api document endpoints"}]}}})
