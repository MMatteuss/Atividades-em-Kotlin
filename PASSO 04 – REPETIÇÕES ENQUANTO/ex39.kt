package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou!
 */
fun main(){
    var i: Int = 11
    while (i > 3){
        i -=1
        print("$i ")
    }
    print("Acabou!")
}
