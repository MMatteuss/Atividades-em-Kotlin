package `PASSO 02 - CONDIÇÕES BÁSICAS`
/*
Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR
 */
fun main(){
    print("Digite um número para ver se ele e impar ou par: ")
    val numero : Int = readln().toInt()
    val impaPar : Int = numero%2
    if (impaPar == 1){
        println("O número $numero é Ímpar")
    }else{
        println("O número $numero é Par")
    }
}
