package `PASSO 07 – REPETIÇÃO COM PARA`
//[DESAFIO] Desenvolva um programa que leia o primeiro termo e a razão de uma
//PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e
//a soma entre todos os valores da sequência.

fun main (){
    print("Digite o valor de PA: ")
    val a1: Float= readln().toFloat()

    print("Digite a razão de PA: ")
    val r: Float = readln().toFloat()

    var soma: Float = 0.0.toFloat()
    // an = a1 + (n - 1) * r

    println("Os 10 primeiros termos da PA são:")
    for (n in 1..10){
        val termo = a1 + (n - 1) * r
        soma += termo
        print("$termo ")
    }
    println(" ")
    println("A soma dos 10 primeiros termos da PA é: $soma")
}