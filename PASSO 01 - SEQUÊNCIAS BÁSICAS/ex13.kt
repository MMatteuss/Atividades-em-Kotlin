/*
 Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento
 */
package execicios

fun main(){
    print("Qual é o nome do funcionario: ")
    val nomeFuncionario: String = readln()
    print("Qual o Salario do Funcionario $nomeFuncionario: ")
    val salarioFuncionario: Float = readln().toFloat()
    val aumentoSalario: Float = (salarioFuncionario+((salarioFuncionario*15)/100))
    println("Com o Almento 15% do salario de $nomeFuncionario, ele receberar ${aumentoSalario}R$")
}