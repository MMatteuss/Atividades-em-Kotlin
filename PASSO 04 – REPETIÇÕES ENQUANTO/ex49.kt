package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
Crie um programa que leia 6 números inteiros e no final
mostre quantos deles são pares e quantos são ímpares.
*/
fun main() {
    var contador: Int = 0
    var verificarImparPar: Int = 0
    var impar: Int =0
    var par: Int =0
    var n1: Int
    while (contador < 6){
        contador++
        print("Digite $contador número: ")
        n1 = readln().toInt()
        verificarImparPar = n1%2
        if(verificarImparPar == 1){
            impar++
        }
        else{
            par++
        }
    }
    println(" ")
    println("No total são : $impar números IMPAR")
    println("No total são : $par números PAR")
}