package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
 Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
qualquer e mostre uma contagem até esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
 */
fun main(){
    print("Digite um valor: ")

    val ida: Int = readln().toInt()
    var i: Int = 0

    while (i < ida){
        i+=1
        print("$i ")
    }
    println("Acabou!")
}
