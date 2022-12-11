(ns  api-login-microservice-v4.config.database
  (:use [korma.db :only [defdb postgres]])
  (:require [clojure.java.io :as io]
            [clojure.java.jdbc :as jdbc]))

(defdb db (postgres {:db "gdh"
                     :user "gdh"
                     :host "captain.prod.guiadehoy.com"
                     :password "LV2Ydyz2!2UDsY$B"}))
