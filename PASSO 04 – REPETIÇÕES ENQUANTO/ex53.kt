package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos
*/
fun main(){
    var contador = 0
    var idade = 0
    var homems = 0
    var mulher = 0
    var mediaIdade = 0
    var mediaIdadeHomem = 0
    var mulherMaior = 0

    while (contador < 5) {
        contador++
        print("Qual e a idade da ${contador}º pessoa: ")
        idade = readln().toInt()

        print("Qual e o seu genero? [H/M] ")
        val qualSex = readln().lowercase()
        mediaIdade += idade

        if (qualSex == "h"){
            homems++
            mediaIdadeHomem +=  idade
        }else{
            mulher++
            if (idade >= 20){mulherMaior++}
        }
        println("---------------------------------------")
    }
    mediaIdadeHomem /= homems
    mediaIdade /= 5
    println("Foram cadastrados $homems homems")
    println("Foram cadastrados $mulher mulheres")
    println("A idade média do grupo e de $mediaIdade")
    println("A idade média dos homems e de $mediaIdadeHomem")
    println("A $mulherMaior mulheres com mais de 20 anos")
}
