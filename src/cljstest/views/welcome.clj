(ns cljstest.views.welcome
  (:use [noir.core :only [defpage]]
        [cljstest.views.common]))

(defpage "/" [] 
         (layout "<h1>Hello World</h1>"))
