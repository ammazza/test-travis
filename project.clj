(defproject sh.serene/test-travis "0.1.0-SNAPSHOT"  
  :description "Just a test project..."
  :url "http://serene.sh"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  ;; :plugins [;; Deploy to/retrieve from private artifact repository on S3.
  ;;           [s3-wagon-private "1.3.0"]
  ;;           ;; Deploy uberjar to S3 repository.
  ;;           [org.ammazza/lein-deploy-uberjar "2.1.0"]]
  ;; :repositories [["snapshots" {:url "s3p://serene-maven-repository/snapshots" :no-auth true :sign-releases false}]
  ;;                ["releases" {:url "s3p://serene-maven-repository/releases" :no-auth true :snapshots false :sign-releases false}]]
  :profiles {:uberjar {:aot :all}}
  :main test-travis.core)
