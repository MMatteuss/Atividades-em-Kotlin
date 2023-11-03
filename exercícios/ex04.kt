fun main(args: Array<String>){
    print("Digite um valor: ")
    var primeiroNumero = readLine()!!.toInt()
    print("Digite outro valor: ")
    var segundoNumero = readLine()!!.toInt()
    var resultado = (primeiroNumero+segundoNumero)

    println("A soma entre $primeiroNumero e $segundoNumero é igual a $resultado")
}
