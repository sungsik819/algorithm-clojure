(ns kyu-8.exclamation-marks-series-4
  (:require [clojure.string :as string]))

(defn remove-bang [s]
  (str (string/replace s "!" "") "!"))