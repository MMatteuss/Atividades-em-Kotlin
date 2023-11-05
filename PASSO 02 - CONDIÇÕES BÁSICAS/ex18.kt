package `PASSO 02 - CONDIÇÕES BÁSICAS`
/*
Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar.
 */
fun main(){
    print("Qual foi o ano de nascimento que você nasceu: ")
    val dataDeNasc: Int = readln().toInt()
    var podeVotar : Int = ((dataDeNasc-2023)*-1)
    if (podeVotar >= 16){
        println("Pode votar!")
    }else{
        println("Não poderar votar")
    }
}
