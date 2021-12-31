(ns basics.consumption-test
  (:require [clojure.test :refer :all]
            [basics.core :refer :all]
            [basics.consumption :refer :all]))
(deftest consumption-tests-calculate
  (testing "should calculate consumption"
    (is (= 14.286 (calculate-consumption 500 35.0)))))

(deftest consumption-tests-format
  (testing "should format consumption"
    (is (= "14.286 km/l" (format-consumption 14.286)))))


(deftest consumption-tests-get
  (testing "should return consumption calculated and formatted"
    (is (= "14.286 km/l" (get-consumption 500 35.0)))))