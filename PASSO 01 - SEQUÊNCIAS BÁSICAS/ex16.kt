package execicios
/*
[DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.
 */
fun main(){
    print("Digite a quantidade de cigarros fumados por dia: ")
    val cigarrosPorDia: Int = readln().toInt()
    print("Digite quantos anos você já fumou: ")
    val anosFumado: Int = readln().toInt()

    val minutosPerdidosPorCigarro: Int = 10
    val totalCigarrosFumados: Int = anosFumado * 360 * cigarrosPorDia
    val totalMinutosPerdido: Int = totalCigarrosFumados * minutosPerdidosPorCigarro
    val diasPerdidos: Int = totalMinutosPerdido / 1440

    println("Você perderá aproximadamente $diasPerdidos dias de vida devido ao hábito de fumar.")
}
