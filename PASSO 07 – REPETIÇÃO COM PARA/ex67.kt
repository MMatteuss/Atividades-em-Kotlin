package `PASSO 07 – REPETIÇÃO COM PARA`
//Faça um programa usando a estrutura “para” que leia um número inteiro
//positivo e mostre na tela uma contagem de 0 até o valor digitado:
//Ex: Digite um valor: 9
//Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!

fun main(){
    print("Digite um número: ")
    val numeroDigitado: Int = readln().toInt()

    print("Contagem: ")
    for (i in 0..numeroDigitado) {
        print("$i, ")
    }
    print("Fim!")
}