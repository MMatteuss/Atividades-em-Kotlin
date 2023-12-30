package `PASSO 07 – REPETIÇÃO COM PARA`
//Escreva um programa que leia um número qualquer e mostre a tabuada desse
//número, usando a estrutura “para”.
//Ex: Digite um valor: 5
//5 x 1 = 5
//5 x 2 = 10
//5 x 3 = 15 ...
fun main(){
    print("Digite um número para ver a tabuada: ")
    val numeroDigitado: Int = readln().toInt()
    for (i in 1..10) {
        val resultado: Int = (numeroDigitado*i)
        println("$numeroDigitado x $i = $resultado")
    }
}