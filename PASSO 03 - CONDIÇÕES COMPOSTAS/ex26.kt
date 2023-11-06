package `PASSO 03 - CONDIÇÕES COMPOSTAS`
/*
 Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
 - O primeiro valor é o maior
 - O segundo valor é o maior
 - Não existe valor maior, os dois são iguais
 */
fun main(){
    print("Digite o valor para o primeiro número: ")
    val numeroUm: Int = readln().toInt()
    print("Digite o valor para o primeiro número: ")
    val numeroDois: Int = readln().toInt()

    if (numeroUm > numeroDois){println("O valor $numeroUm é o maior do que o valor $numeroDois")}
    else if (numeroDois > numeroUm){println("O valor $numeroDois é o maior do que o valor $numeroUm")}
    else if (numeroUm == numeroDois){println("O valor $numeroUm é igual ao valor $numeroDois")}
}
