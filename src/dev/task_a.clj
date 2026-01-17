(ns task-a)

(println "Requiring task-a namespace")

(defn task-a
  "Perform task A"
  [& args]
  (println "Task A args:" (pr-str args)))
