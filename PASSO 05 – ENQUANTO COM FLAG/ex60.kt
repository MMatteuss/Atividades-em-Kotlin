package `PASSO 05 – ENQUANTO COM FLAG`

/*
Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
a) O nome da pessoa mais velha
b) O nome da mulher mais jovem
c) A média de idade do grupo
d) Quantos homens tem mais de 30 anos
e) Quantas mulheres tem menos de 18 anos
 */

fun main(){
    var nome: String
    var idade: Int
    var idadeMaisVelha = 0
    var idadeMaisVelhaMulher = 0
    var nomeMaisVelha = ""
    var idadeMediaGrupo = 0
    var sexo: String
    var nomeMulherJovem = ""
    var pessoasDoGrupo = 0
    var totalDeIdadeDasPessoasDoGrupo = 0
    var homensAcimaDeTrintaAnos = 0
    var mulheresMenorDeDezoitoAnos = 0
    var SimOuNao = "s"

    while (SimOuNao == "s") {
        print("Qual e o nome dessa pessoa: ")
        nome = readln()

        print("Qual a idade de $nome: ")
        idade = readln().toInt()

        print("Qual o sexo de $nome [M,F]: ")
        sexo = readln().lowercase()

        if (idade > idadeMaisVelha) {
            idadeMaisVelha = idade
            nomeMaisVelha = nome
        }

        if ((idade > idadeMaisVelhaMulher) && (sexo == "f")) {
            idadeMaisVelhaMulher = idade
            nomeMulherJovem = nome
        }

        if ((idade >= 30) && (sexo == "m")) {
            homensAcimaDeTrintaAnos++
        }

        if ((idade <= 18) && (sexo == "f")) {
            mulheresMenorDeDezoitoAnos++
        }

        pessoasDoGrupo++
        totalDeIdadeDasPessoasDoGrupo += idade
        idadeMediaGrupo = totalDeIdadeDasPessoasDoGrupo/pessoasDoGrupo

        print("A mais pessoas no grupo [S,N]: ")
        SimOuNao = readln().lowercase()
        println(" ")
    }
    println("--------------------------------------------")
    println(" ")
    println("O $nomeMaisVelha e a pessoa mais velha do grupo")
    println("O nome da mulher mais jovem e $nomeMulherJovem")
    println("A média de idade do grupo e de $idadeMediaGrupo")
    println("A $homensAcimaDeTrintaAnos homens que tem mais de 30 anos")
    println("A $mulheresMenorDeDezoitoAnos de mulheres que tem menos de 18 anos")
}
