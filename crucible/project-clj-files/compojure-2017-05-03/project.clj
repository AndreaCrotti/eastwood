(defproject compojure "1.6.0"
  :description "A concise routing library for Ring"
  :url "https://github.com/weavejester/compojure"
  :license {:name "Eclipse Public License"
            :url "https://www.eclipse.org/legal/epl-v10.html"}
  :global-vars {*warn-on-reflection* true}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.macro "0.1.5"]
                 [clout "2.1.2"]
                 [medley "1.0.0"]
                 [ring/ring-core "1.6.0"]
                 [ring/ring-codec "1.0.1"]]
  :plugins [[lein-codox "0.10.3"]]
  :codox
  {:output-path "codox"
   :metadata {:doc/format :markdown}
   :source-uri "https://github.com/weavejester/compojure/blob/{version}/{filepath}#L{line}"}
  :aliases
  {"test-all" ["with-profile" "default:+1.8" "test"]}
  :profiles
  {:dev {:jvm-opts ^:replace []
         :dependencies [[ring/ring-mock "0.3.0"]
                        [criterium "0.4.4"]
                        [javax.servlet/servlet-api "2.5"]]}
   :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
   :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
   :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
   :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}
   :1.10 {:dependencies [[org.clojure/clojure "1.10.0-master-SNAPSHOT"]]}
   })
