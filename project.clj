 (defproject cljstest "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :dependencies [[org.clojure/clojure "1.4.0"]
                           [noir "1.3.0-beta10"]]
            :plugins [[lein-cljsbuild "0.2.7"]] ; cljsbuild plugin
            :cljsbuild
            {:builds
              [{:builds nil,
                :source-path "src-cljs",
                :compiler
                {:pretty-print true,
                 :output-to "resources/public/js/cljs.js",
                 :optimizations :simple}}]}
            :main cljstest.server)

