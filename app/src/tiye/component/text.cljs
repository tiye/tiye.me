
(ns tiye.component.text (:require [respo.alias :refer [create-comp span]]))

(defn render [content style]
  (fn [state mutate!] (span {:attrs {:inner-text content}, :style style})))

(def comp-text (create-comp :text render))
