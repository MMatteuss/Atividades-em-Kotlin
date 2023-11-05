/*
 Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
 */
fun main(args: Array<String>){
    print("Quando R$")
    var reais = readLine()!!.toFloat()
    var emDolar = (reais*3.44)
    println("O valor para dolar será $emDolar")
}