(defproject ring "0.3.6"
  :description "A Clojure web applications library."
  :url "http://github.com/mmcgrana/ring"
  :dependencies
    [[ring/ring-core "0.3.6"]
     [ring/ring-devel "0.3.6"]
     [ring/ring-jetty-adapter "0.3.6"]
     [ring/ring-jetty7-adapter "0.3.6"]
     [ring/ring-servlet "0.3.6"]]
  :dev-dependencies
    [[lein-eclipse "1.0.0"]
     [autodoc "0.7.1" :exclusions [org.clojure/clojure
                                   org.clojure/clojure-contrib]]]
  :autodoc
    {:name "Ring"
     :description "A Clojure web applications library"
     :copyright "Copyright 2009-2010 Mark McGranaghan"
     :root "."
     :source-path ""
     :web-src-dir "http://github.com/mmcgrana/ring/blob/"
     :web-home "http://mmcgrana.github.com/ring/"
     :output-path "autodoc"
     :namespaces-to-document ["ring"]
     :trim-prefix "ring."
     :load-except-list [#"/example/" #"/test/" #"project\.clj"]})
