package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
a) Qual é a média de idade do grupo
b) Quantas pessoas tem mais de 18 anos
c) Quantas pessoas tem menos de 5 anos
d) Qual foi a maior idade lida
 */
fun main (){
    var contador = 0
    var idade: Int
    var maiorIdade = 0
    var idadeMedia = 0
    var idadeMaior = 0
    var idadeMenor = 0

    while (contador <10){
        contador++
        print("Qual a idade da $contador° pessoa: ")
        idade = readln().toInt()
        idadeMedia += idade
        if (idade > maiorIdade){maiorIdade = idade}
        if (idade >= 18){idadeMaior++}
        if (idade <= 5){idadeMenor++}
    }

    idadeMedia /= 10
    println("----------------------------------------------------")
    println("A idade média do grupo é $idadeMedia anos")
    println("A $idadeMaior pessoas do grupo que é maior de 18 anos")
    println("A $idadeMenor pessoas do grupo que é menor de 5 anos")
    println("A idade mais alta do grupo foi de $maiorIdade anos")
}
