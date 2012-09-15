(ns cljstest.views.lists
  (:use [noir.core :only [defpage]]
        [cljstest.views.common]))

(defpage "/" [] 
         (layout "<h1>Hello World</h1>"))
