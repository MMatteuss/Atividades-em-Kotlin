/*
Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666
 */
fun main(args: Array<String>){
    print("Digite um número real: ")
    var numero = readLine()!!.toFloat()

    println("O dobro de $numero é ${numero*2}")
    println("A terça parte de $numero é ${(numero/3)}")
}