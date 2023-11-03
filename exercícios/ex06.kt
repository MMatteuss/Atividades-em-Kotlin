fun main(args: Array<String>){
    print("Digite um Número: ")
    var numero = readLine()!!.toInt()
    println("O antecessor de $numero é ${numero-1}")
    println("O sucessor de $numero é ${numero+1}")
}