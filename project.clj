(defproject compojure "1.1.0"
  :description "A concise web framework for Clojure"
  :url "https://github.com/weavejester/compojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojure/core.incubator "0.1.0"]
                 [org.clojure/tools.macro "0.1.0"]
                 [clout "1.0.1"]
                 [ring/ring-core "1.1.1"]]
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.1"]]}})
