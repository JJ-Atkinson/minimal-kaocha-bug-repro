(ns dev.freeformsoftware.main-test
  (:require
   [clojure.test :refer [deftest is testing]]
   [dev.freeformsoftware.main :as sut]))

(deftest identity2 
  (testing "identity for nil"
    (is (= 0 (sut/identity2 0)))))
