(defproject nuday-utils "0.1.0-SNAPSHOT"  ; handled by lein-git-version
  :description "Nuday Clojure utilities"
  :url "https://github.com/Nuday/nuday-utils"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [environ "1.0.0"]
                 [prismatic/schema "0.3.3"]]

  :plugins [[org.clojars.cvillecsteele/lein-git-version "1.0.2"]]

  :profiles {:dev {:dependencies [[pjstadig/humane-test-output "0.6.0"]]
                   :injections [(require 'pjstadig.humane-test-output)
                                (pjstadig.humane-test-output/activate!)]
                   :source-paths ["src" "dev"]}

             :test {;; dev/user.clj breaks the build in test mode
                    :source-paths ^:replace ["src"]}})
