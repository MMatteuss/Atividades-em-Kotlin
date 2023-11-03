fun main(args: Array<String>){
    print("Qual o seu nome? ")
    var nomeFuncionario = readLine()!!.capitalize()
// OBs: O println ele seria uma quebra de linha, mas o print ele serio como fosse a mesma linha
    print("Qual o seu salário? ")
    var salarioFuncionario = readLine()!!.toInt()
    //Para fazer um input para receber um número inteiro, e necessario colocar o !!.toInt(). Que assim a linguagem vai entender que vai receber um número inteiro

    println("Nome do Funcionário: $nomeFuncionario")
    println("Salário: $salarioFuncionario")
    println("O funcionário $nomeFuncionario tem um salário de R$$salarioFuncionario em Junho.")
}