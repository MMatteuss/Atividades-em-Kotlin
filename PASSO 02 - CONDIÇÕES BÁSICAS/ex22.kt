package `PASSO 02 - CONDIÇÕES BÁSICAS`
/*
Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento
 */
fun main() {
    print("Qual foi o ano de nascimento que você nasceu: ")
    val dataDeNasc: Int = readln().toInt()
    val idade: Int = ((dataDeNasc - 2023) * -1)

    if (idade > 18) {
        println("Você tem $idade anos, já se passaram ${idade - 18} anos para o alistamento")

    }else if (idade == 18){
        println("Você tem $idade anos, ir para o alistamento")
    }
    else{
        println("Você tem $idade anos, faltam ${(idade - 18)*-1} anos para o alistamento.")
    }
}
