/*
Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10
 */
fun main(args: Array<String>){
    print("Digite um Número: ")
    var numero = readLine()!!.toInt()
    println("O antecessor de $numero é ${numero-1}")
    println("O sucessor de $numero é ${numero+1}")
}