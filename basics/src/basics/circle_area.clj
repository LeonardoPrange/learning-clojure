(ns basics.circle-area)

(def pi 3.14159)

(defn area-circle  [r]
  (double (Double/parseDouble (format "%.4f" (* pi (* r r))))))