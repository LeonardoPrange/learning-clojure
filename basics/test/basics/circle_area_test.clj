(ns basics.circle-area-test
  (:require [clojure.test :refer :all]
            [basics.core :refer :all]
            [basics.circle-area :refer :all]))
(deftest cicle-area-tests
  (testing "should return area of the circle"
    (is(= 12.5664 (area-circle 2.00)))))