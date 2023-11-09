package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
 Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
450 + 400 + 350 + 300 + ... + 50 + 0
 */
fun main(){
    var i: Int = 500
    var amazenaNumero: Int = 0
    var amazenaNumeroA: Int = 0

    while (i > 0){
        print("$i +")
        amazenaNumeroA +=1
        amazenaNumero = (amazenaNumero + i)
        i -= 50
    }
    amazenaNumeroA *= amazenaNumeroA
    print(" a ${amazenaNumero - amazenaNumeroA}")
}
