fun main(args: Array<String>){
    print("Digite um número real: ")
    var numero = readLine()!!.toFloat()

    println("O dobro de $numero é ${numero*2}")
    println("A terça parte de $numero é ${(numero/3)}")
}