(defproject com.gfredericks/korma "0.3.0-RC2-p1"
  :description "Tasty SQL for Clojure (gfredericks fork)"
  :url "http://github.com/fredericksgary/korma"
  :mailing-list {:name "Korma Google Group"
                 :subscribe "https://groups.google.com/group/sqlkorma"}
  :codox {:exclude [korma.sql.engine
                    korma.sql.fns
                    korma.sql.utils]
          :src-dir-uri "https://github.com/korma/Korma/blob/master"
          :src-linenum-anchor-prefix "L"}
  
  ;;Lein2 - the way of the future
  :profiles {:user {:dependencies [[org.clojure/clojure "1.4.0"]
                                   [c3p0/c3p0 "0.9.1.2"]
                                   [org.clojure/java.jdbc "0.2.3"]]}
             :dev {:dependencies [[com.h2database/h2 "1.3.164"]
                                  [postgresql "9.0-801.jdbc4"]
                                  [slamhound "1.3.1"]]
                   :plugins [[codox "0.6.4"]
                             [jonase/eastwood "0.0.2"]
                             [lein-localrepo "0.4.1"]]}
             :1.3.0 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4.0 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5.0 {:dependencies [[org.clojure/clojure "1.5.0-RC1"]]}}
  :aliases {"run-tests" ["with-profile" "1.3.0:1.4.0:1.5.0" "test"]
            "slamhound" ["run" "-m" "slam.hound"]}

  ;; Lein1 - will be removed at some point
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [c3p0/c3p0 "0.9.1.2"]
                 [org.clojure/java.jdbc "0.2.2"]]
  :dev-dependencies [[com.h2database/h2 "1.3.164"]
                     [postgresql "9.0-801.jdbc4"]])