/*
 Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm

 */
fun main(args: Array<String>){
    print("Digite uma distância em metros: ")
    var m = readLine()!!.toFloat()

    // Divição
    var km = m/1000
    var hm = m/100
    var dam = m/10

    // Multiplicação
    var dm = m*10
    var cm = m*100
    var mm = m*1000

    println("$km km")
    println("$hm hm")
    println("$dam dam")
    println("$dm dm")
    println("$cm cm")
    println("$mm mm")
}