/*
 A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
 */
package execicios

fun main() {
    print("Qual e a quantidades de Dias que esse carrro estar alugado: ")
    val quantidadeDias: Int = readln().toInt()
    print("Qual a quantidade percorrida no carro alugado: ")
    val quantidadeKm: Float = readln().toFloat()
    val precoTotalPagar: Float = ((quantidadeKm*0.90).toFloat())+(quantidadeKm * 90)
    print("O preço total a pagar é ${precoTotalPagar}R$")
}