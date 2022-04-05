(ns user)

(comment
 
 (do
   (require 'kaocha.repl)
   (require 'dev.freeformsoftware.main-test)
   (kaocha.repl/run (ns-name 'dev.freeformsoftware.main-test)))

 (kaocha.repl/run (ns-name 'dev.freeformsoftware.random-error-test)))
