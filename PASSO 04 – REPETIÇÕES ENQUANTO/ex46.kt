package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
 Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
8 + 10 + 12 + 14 + ... + 98 + 100.
 */
fun main (){
    var i: Int = 0
    var amazeinaNumero: Int = 0
    while (i < 100){
        i +=2
        if(i == 2){
            print("${i-2} ")
        }
        print("+ $i ")
        amazeinaNumero = (amazeinaNumero+i)
    }
    println("= $amazeinaNumero")
}
