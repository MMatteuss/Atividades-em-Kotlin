package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e mostre na tela:
 a) Quais foram os números sorteados
 b) Quantos números estão acima de 5
 c) Quantos números são divisíveis por 3
*/
fun main(args: Array<String>) {
    var numero: Int = 0
    val numeroSortiado = mutableListOf<Int>()
    var contador: Int = 0

    var acimaDeCinco: Int = 0
    var divisivelPorTres: Int = 0

    while (contador < 20) {
        contador ++
        numero = (0..10).random()
        numeroSortiado.add(numero)
        if(numero>=5){acimaDeCinco++}
        if(numero%3 == 0){divisivelPorTres++}
    }
    println("Números sorteados: $numeroSortiado")
    println("Quantidade de números divisíveis por 5: $acimaDeCinco ")
    println("Quantidade de números divisíveis por 3: $divisivelPorTres")

}