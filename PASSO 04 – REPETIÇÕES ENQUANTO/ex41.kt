package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
Desenvolva um programa que mostre na tela a seguinte contagem:
100 95 90 85 80 ... 0 Acabou!
 */
fun main(){
    var i: Int = 100
    while (i >= 0){
        print("$i ")
        i -=5
    }
    println("Acabou !")
}
