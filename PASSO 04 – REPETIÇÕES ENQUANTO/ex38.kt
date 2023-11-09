package `PASSO 04 – REPETIÇÕES ENQUANTO`
/* Escreva um programa que mostre na tela a seguinte contagem:
6 7 8 9 10 11 Acabou!
 */
fun main (){
    var i: Int = 5
    while (i < 11){
        i +=1
        print("$i ")
    }
    println("Acabou!")
}
