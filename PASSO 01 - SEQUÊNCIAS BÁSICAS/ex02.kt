/*
Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer
*/
fun main(args: Array<String>){
    print("Qual o seu nome? ")
    val userInput: String = readln()

    println("Seu nome é $userInput")
    println("olá $userInput é um prazer em te conhecer!")
}