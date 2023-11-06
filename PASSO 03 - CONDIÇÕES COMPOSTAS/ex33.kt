package `PASSO 03 - CONDIÇÕES COMPOSTAS`
/*
Escreva um programa para aprovar ou não o empréstimo bancário para a compra
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
ela não pode exceder 30% do salário ou então o empréstimo será negado.
 */
fun main(){
    var prestacao_mensal: Float
    var limite_prestacao: Float
    print("Valor da casa: ")
    val valor_casa : Float = readln().toFloat()
    print("Valor do salario: ")
    val salario_comprador : Float = readln().toFloat()
    print("Quanto anos vai pagar: ")
    val prazo_pagamento : Int = readln().toInt()

    prestacao_mensal = valor_casa/(prazo_pagamento * 12)
    limite_prestacao = (salario_comprador * 0.3).toFloat()

    if (prestacao_mensal <= limite_prestacao){
        println("Emprestimo Permitido")
    }else{
        println("Emprestimo Negado")
    }

}
