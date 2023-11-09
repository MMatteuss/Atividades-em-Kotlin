package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
 Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou!
 */
fun main(){
    var i: Int = 0
    while (i < 18){
        i += 3
        print("$i ")
    }
    print("Acabou!")
}
