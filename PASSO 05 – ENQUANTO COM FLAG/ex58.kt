package `PASSO 05 – ENQUANTO COM FLAG`
/*
Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
vai parar quando for digitada a idade 999. No final, mostre quantos alunos
existem na turma e qual é a média de idade do grupo.
 */
fun main(){
    var idade: Int
    var alunosExistente = 0
    var mediaAluno = 0
    var continuar = true

    while (continuar == true){

        print("Digite a idade do $alunosExistente° aluno (ou digite 999 para finalizar o programa): ")
        idade = readln().toInt()
        if (idade == 999){ continuar = false } else { alunosExistente ++ }
        mediaAluno += idade
        println("")
    }
    mediaAluno -= 999
    println("A $alunosExistente alunos na turma")
    println("A media de idade e ${mediaAluno/alunosExistente}")

}
