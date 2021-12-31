(ns basics.consumption)

(defn format-consumption
  [consumption]
  (str consumption " km/l"))

(defn calculate-consumption
  [travelledDistance spentFuelTotal]
  (Double/parseDouble(format "%.3f" (/ travelledDistance spentFuelTotal))))

(defn get-consumption
  [travelledDistance spentFuelTotal]
  (format-consumption (calculate-consumption travelledDistance spentFuelTotal)))
