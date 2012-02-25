(ns eastwood.linters.reflection
  (:use analyze.util))

(defmulti reflective-call? :op)

(defmethod reflective-call? :instance-method [expr]
  (not (:method expr)))

(defmethod reflective-call? :instance-field [expr]
  (not (:field expr)))

(defmethod reflective-call? :default [_] false)

(defmulti report :op)

(defmethod report :instance-method [expr]
  (println "Unresolved instance method"
           (:method-name expr)
           "in"
           (-> expr :env :ns :name)))

(defmethod report :instance-field [expr]
  (println "Unresolved instance field"
           (:field-name expr)
           "in"
           (-> expr :env :ns :name)))

(defn reflection [exprs]
  (doseq [expr (mapcat expr-seq exprs)
          :when (reflective-call? expr)]
    (report expr)))