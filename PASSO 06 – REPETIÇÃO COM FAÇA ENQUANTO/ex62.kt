package `PASSO 06 – REPETIÇÃO COM FAÇA ENQUANTO`
/*
Faça um programa usando a estrutura “faça enquanto” que leia a idade de
várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou
não continuar a digitar dados. No final, quando o usuário decidir parar, mostre
na tela:
    a) Quantas idades foram digitadas
    b) Qual é a média entre as idades digitadas
    c) Quantas pessoas tem 21 anos ou mais.
 */
fun main(){
    var continuar = "s"
    var pessoa = 0
    var idade = 0
    var mediaIdade = 0
    var pessoasMaiorDeVinteUm = 0

    do{
        pessoa++
        print("Qual e a idade da ${pessoa}° pessoa: ")
        idade = readln().toInt()

        mediaIdade += idade

        if (idade >= 21){ pessoasMaiorDeVinteUm++ }

        print("Deseja continuar? [s,n] ")
        continuar = readln().lowercase()
        while (continuar != "s" && continuar != "n"){
            print("Digite [s,n] para continuar: ")
            continuar = readln().lowercase()
        }
        if (continuar == "s") { println(" ") }
    } while(continuar == "s")
    mediaIdade/=pessoa

    println("")
    println("Foram digitadas $pessoa idades")
    println("O valor da médio das idades e de $mediaIdade")
    println("No total foram $pessoasMaiorDeVinteUm pessoas acima de 21 anos ou mais")
}