(defproject org.clojure/core.match "0.2.2-SNAPSHOT"
  :description "Optimized pattern matching and predicate dispatch for Clojure"

  :global-vars {*warn-on-reflection* true}
  :jvm-opts ^:replace ["-Xmx512m" "-server"]

  :test-paths ["src/test/clojure"]
  :source-paths ["src/main/clojure"]

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2138" :scope "provided"]]
  :profiles {:1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0-master-SNAPSHOT"]]}}

  :dev-dependencies [[org.clojure/tools.nrepl "0.2.3"]]

  :plugins [[lein-cljsbuild "1.0.1"]]

  :cljsbuild
  {:builds
   [{:id "test"
     :source-paths ["src/test/cljs"]
     :compiler {:output-to "out/test.js"
                :static-fns true
                :optimizations :simple}}
    {:id "test-adv"
     :source-paths ["src/test/cljs"]
     :compiler {:output-to "out/test.js"
                :optimizations :advanced}}]})
