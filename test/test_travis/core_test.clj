(ns test-travis.core-test
  (:require [clojure.test :refer :all]
            [test-travis.core :refer :all]))

(deftest a-test
  (testing "All good here...."
    (is (= 1 1))))
