(ns blackjack-v2.teste1)

; var nome = "Cesar";
; var idade = 30;
; int idade = 30;
(def nome "Cesar")
(def idade 30)
(def numeros [1 3 6 8])
(println numeros)

(defn saudacao
  "Saudacao iniciante em Clojure"
  [arg]
  (str "Bem vindo " arg))

(println (saudacao nome))
