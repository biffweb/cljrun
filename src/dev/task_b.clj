(ns task-b)

(println "Requiring task-b namespace")

(defn task-b
  "Perform task B"
  [& args]
  (println "Task B args:" (pr-str args)))
