package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
qual foi o maior e qual foi o menor preço digitados.
 */
fun main(){
    var contador: Int = 0
    var preco: Float = 0.0F
    var maior_preco = Float.MAX_VALUE
    var menor_preco = Float.MAX_VALUE

    while (contador < 8){
        contador++
        print("Qual o valor do $contador° produto: ")
        preco = readln().toFloat()
        println("---------------------------------")
        if (preco > maior_preco){maior_preco = preco}
        if (preco < menor_preco){menor_preco = preco}
    }
    println("O maior preço digitado foi: R$ $maior_preco")
    println("O menor preço digitado foi: R$ $menor_preco")
}