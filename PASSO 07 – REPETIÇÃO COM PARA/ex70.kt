package `PASSO 07 – REPETIÇÃO COM PARA`
//70) [DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência
//de Fibonacci:
//1 1 2 3 5 8 13 21...

fun main (){
    var a = 1
    var b = 0
    var c = 0

    for (i in 1..10){
        c = a+b
        print("$c ")
        a = b
        b = c
    }
}
