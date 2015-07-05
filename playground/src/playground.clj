( ns playground
(:use ([clojure.string])))


(def upercase-string [s]
 (clojure.string))

(def player {
:name "name"
:team "A-team"
:total-score []
:history []
})

(defn make-player [name team scope history]{
                                            :name name
                                            :team team
                                            :total-score scope
                                            :history history
                                            })
