(defproject practice-exacmples "0.1.0-SNAPSHOT"
  :description "Clojure examples"
  :url "http://github.com/sumitmah"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot practice-exacmples.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
