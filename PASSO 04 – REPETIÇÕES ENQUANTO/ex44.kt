package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!
 */
fun main(){
    print("Digite o primeiro Valor: ")
    var primeiroValor: Int = readln().toInt()

    print("Digite o último Valor: ")
    var ultimoValor: Int = readln().toInt()

    print("Digite o incremento: ")
    var incremento: Int = readln().toInt()

    print("Contagem: ")
    while (primeiroValor < ultimoValor){
        print("$primeiroValor ")
        primeiroValor = primeiroValor + incremento
    }
    print("Acabou!")
}
