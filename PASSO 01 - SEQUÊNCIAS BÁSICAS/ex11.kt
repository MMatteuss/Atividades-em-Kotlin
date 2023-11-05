/*
Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta
 */
package execicios

import kotlin.math.pow

fun main(){
    print("O valor de C ele e negativo? [s/n]")
    val valoCn: String = readln()!!.toString()
    if (valoCn == "s"){
        print("Digite o valor de ax² ")
        val valorA : Int = readln().toInt()
        print("Digite o valor de bx ")
        val valorBint : Int = readln().toInt()
        val valorB = valorBint.toDouble().pow(2)
        // valorB: Float
        print("Digite o valor de c ")
        readln().toInt()

        val valorDelta = (valorB.pow(2) -4 * (valorA * -valorB))

        println("O valor de Delta e igual á $valorDelta")
    }else if(valoCn == "n"){
        print("Digite o valor de ax² ")
        val valorA : Int = readln().toInt()
        print("Digite o valor de bx ")
        val valorBint : Int = readln().toInt()
        val valorB = valorBint.toDouble().pow(2)
        // valorB: Float
        print("Digite o valor de c ")
        readln().toInt()

        val valorDelta = (valorB.pow(2) -4 * (valorA * (valorB)))

        println("O valor de Delta e igual á $valorDelta")
    }else{
        println("Porfavor reinicie o código e coloque S: para SIM, e N: para NÃo")
    }
}
