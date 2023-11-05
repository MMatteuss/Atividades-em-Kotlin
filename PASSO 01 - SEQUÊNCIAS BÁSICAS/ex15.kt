/*
Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada.
 */
package execicios

fun main() {
    print("Qual o nome do funcionario: ")
    val nomeFuncionario: String = readln()
    print("Quantos dias do mês o $nomeFuncionario trabalha: ")
    val diasFuncionario: Int = readln().toInt()
    val salarioFuncionario : Float = (diasFuncionario*8*25).toFloat()
    print("O salário mensal do funcionário é: R$$salarioFuncionario")
}