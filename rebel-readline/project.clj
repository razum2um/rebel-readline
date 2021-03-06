(defproject razum2um/rebel-readline "0.1.6-SNAPSHOT"
  :description "Terminal readline library for Clojure dialects"
  :url "https://github.com/bhauman/rebel-readline"
  :license {:name "Eclipse Public License"
            :distribution :repo
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :scm {:name "git"
        :url "https://github.com/bhauman/rebel-readline"
        :dir ".."}

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.jline/jline-reader "3.5.1"]
                 [org.jline/jline-terminal "3.5.1"]
                 [org.jline/jline-terminal-jansi "3.5.1"]
                 [cljfmt "0.6.4" :exclusions [rewrite-clj]]     ;; depends on tools reader
                 [rewrite-clj "0.6.1"]
                 [compliment "0.3.6"]]

  :profiles {:dev {:source-paths ["src" "dev"]
                   :main rebel-dev.main}})
