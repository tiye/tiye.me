
(ns tiye.component.offline-tip
  (:require [respo.alias :refer [create-comp div span]]
            [tiye.component.text :refer [comp-text]]
            [tiye.style.widget :as widget]
            [tiye.style.layout :as layout]))

(defn on-click [] (.reload js/location))

(defn render []
  (fn [state mutate!]
    (div
     {:style (merge
              layout/vertical-box
              widget/notice-large
              {:cursor "pointer", :height "320px"}),
      :event {:click on-click}}
     (comp-text "Chat server is down, click to reload." nil))))

(def comp-offline-tip (create-comp :offline-tip render))
