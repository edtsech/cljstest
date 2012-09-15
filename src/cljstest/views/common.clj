(ns cljstest.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css include-js html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "zz"]]
              [:body
               [:div#wrapper
                content]]
              (include-js "/js/cljs.js")))

