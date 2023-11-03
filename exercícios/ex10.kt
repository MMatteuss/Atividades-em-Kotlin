package execicios

fun main() {
    print("Qual a largura da parede: ")
    val larguraParede: Int = readln().toInt()
    print("Qual a altura da parede: ")
    val alturaParede: Int = readln().toInt()
    val areaParede = (larguraParede*alturaParede)
    println("A Área da parede é ${areaParede}. sendo assim e necessario ${areaParede/2} litros de tinta")
}