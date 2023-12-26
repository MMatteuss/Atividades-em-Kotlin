package `PASSO 06 – REPETIÇÃO COM FAÇA ENQUANTO`
/*
63) Crie um programa usando a estrutura “faça enquanto” que leia vários números.
A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
tela:
    a) O somatório entre todos os valores
    b) Qual foi o menor valor digitado
    c) A média entre todos os valores
    d) Quantos valores são pares
 */
fun main(){
    var continuar = "s"
    var somatorioTodosNumero = 0
    var numeroDigitado = 0
    var divisor = 0
    var valoresPares = 0
    var menorNumero = 0
    var numero = 0
    var mediaNumeros = 0

    do{
        print("Digite um valor: ")
        numeroDigitado = readln().toInt()
        somatorioTodosNumero+=numeroDigitado
        divisor++

        if (numeroDigitado%2 == 0){
            valoresPares++
        }

        //numeroDigitado     numero    menorNumero
        if (numeroDigitado < numero){
            menorNumero = numeroDigitado
        } else {
            numero = numeroDigitado
        }

        if (numeroDigitado > numero){
            numero = numeroDigitado
        }


        print("Deseja continuar? [s,n] ")
        continuar = readln()
        while (continuar !="s" && continuar !="n"){
            print("Deseja continuar? [s,n] ")
            continuar = readln()
            println(" ")
        }

        if(continuar == "s"){
            println(" ")
        }
    } while (continuar == "s")

     mediaNumeros = somatorioTodosNumero/divisor

    println(" ")

    println("O somatorio entre todos os valores são $somatorioTodosNumero")
    println("O menor valor digitado foi $menorNumero")
    println("A média entre todos os valores são $mediaNumeros")
    println("A no total $valoresPares valores pares")
}
