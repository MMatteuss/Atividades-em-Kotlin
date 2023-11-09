package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
 Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1,
marcando os números que forem divisíveis por 4, exatamente como mostrado abaixo:
30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
 */
fun main(){
    var i : Int = 30
    var divisor: Int
    while (i > 0){
        print("$i ")
        divisor = i%4
        if (divisor == 1){
            i -=1
            print("[$i] ")
        }
        i -= 1
    }
}
