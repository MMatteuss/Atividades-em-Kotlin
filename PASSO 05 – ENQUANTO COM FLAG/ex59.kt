@file:Suppress("UNUSED_EXPRESSION")

package `PASSO 05 – ENQUANTO COM FLAG`

/*
Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
//  a) qual é a maior idade lida
// b) quantos homens foram cadastrados
//  c) qual é a média de idade entre os homens
//  d) qual é a idade da mulher mais jovem
 */
fun main(){
    var pessoaSex: String
    var pessoa = 0
    var pessoaIdadeMasculino = 0
    var pessoaIdadeFeminina = 0
    var continuar= true
    var continuarPergunta: String
    var idadeMasc = 0
    var idadeFemi = 0
    var homemCadastrados = 0
    var idadealta = 0

    while (continuar){
        pessoa++
        print("Qual e o género dessa ${pessoa}º pessoa:[M, F] ")
        pessoaSex = readln().lowercase()
        if (pessoaSex == "m"){ homemCadastrados ++ }

        if (pessoaSex == "m") {
            print("Qual e a idade dessa ${pessoa}º pessoa com o genero Masculino: ")
            pessoaIdadeMasculino = readln().toInt()

            if (pessoaIdadeMasculino > idadeMasc){
                pessoaIdadeMasculino
            }
            idadeMasc = pessoaIdadeMasculino
        } else {
            print("Qual e a idade dessa ${pessoa}º pessoa com o genero Feminino: ")
            pessoaIdadeFeminina = readln().toInt()

            if (pessoaIdadeFeminina < idadeFemi){
                pessoaIdadeFeminina
            }
            idadeFemi = pessoaIdadeFeminina
        }
        idadealta = if(idadeMasc > idadeFemi){
            idadeMasc
        }else{
            idadeFemi
        }

        print("Deseja continuar? [s,n] ")
        continuarPergunta = readln().lowercase()
        continuar = continuarPergunta == "s"

    }

    println("A maior idade lida e $idadealta")
    println("foram $homemCadastrados homens cadastrados")
    println("A média de idade entre os homens ${pessoaIdadeMasculino/homemCadastrados}")
    println("A idade da mulher mais jovem e de $pessoaIdadeFeminina")
}
