(ns cljstest.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css include-js html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "Hello World"]]
              [:body
               [:div#wrapper
                content]]
              (include-js "/js/cljs.js")))

