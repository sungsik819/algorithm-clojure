(ns kyu-8.convert-number-to-reversed-array-of-digits)

;; convert number to reversed array of digits
(defn num-digits [n]
  (map #(Character/getNumericValue %) (str n)))

(def digits (comp num-digits str))

(defn digitize [n]
  (reverse (digits n)))