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