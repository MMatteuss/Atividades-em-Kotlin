/*
Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5
 */
fun main(args: Array<String>){
    print("Digite sua nota 1: ")
    var notaUm = readLine()!!.toFloat()
    print("Digite sua nota 2: ")
    var notaDois = readLine()!!.toFloat()
    var media = ((notaUm+notaDois)/2)

    println("A Media entre $notaUm e $notaDois é igual a $media")
}