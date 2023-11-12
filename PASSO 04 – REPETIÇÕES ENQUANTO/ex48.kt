package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
Faça um programa que leia 7 números inteiros e no final mostre o somatório entre eles.
*/
fun main() {
    var contador: Int = 0
    var soma: Int = 0
    var n1: Int
    // var soma: Int
    while(contador<7){
        contador += 1
        print("Digite o ${contador}° número: ")
        n1 = readln().toInt()
        soma = (soma+n1)
    }
    println("A soma entres os 7 números digitados, e igual a $soma")
}