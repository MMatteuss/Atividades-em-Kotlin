/*
 Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.
 */
fun main(args: Array<String>){
    print("Digite um valor: ")
    var primeiroNumero = readLine()!!.toInt()
    print("Digite outro valor: ")
    var segundoNumero = readLine()!!.toInt()
    var resultado = (primeiroNumero+segundoNumero)

    println("A soma entre $primeiroNumero e $segundoNumero é igual a $resultado")
}
