package `PASSO 03 - CONDIÇÕES COMPOSTAS`
/*
O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
indivíduo dentro de certas faixas.
 - abaixo de 18.5: Abaixo do peso
 - entre 18.5 e 25: Peso ideal
 - entre 25 e 30: Sobrepeso
 - entre 30 e 40: Obesidade
 - acima de 40: Obseidade mórbida
*/

fun main() {
    print("Qual é o seu peso (em quilogramas): ")
    val peso: Float = readln().toFloat()

    print("Qual é a sua altura (em metros): ")
    val altura: Float = readln().toFloat()

    val imc: Float = peso / (altura * altura)

    println("Seu IMC é: $imc")

    if (imc < 18.5) {
        println( "Abaixo do peso")
    } else if (imc >= 18.5 && imc < 25) {
        println( "Peso ideal")
    } else if (imc >= 25 && imc < 30) {
        println( "Sobrepeso")
    } else if (imc >= 30 && imc < 40) {
        println( "Obesidade")
    } else {
        println( "Obesidade mórbida")
    }
}