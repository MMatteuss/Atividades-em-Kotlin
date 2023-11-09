package `PASSO 03 - CONDIÇÕES COMPOSTAS`
/*
Uma empresa precisa reajustar o salário dos seus funcionários, dando um
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
No final, mostre o seu novo salário, baseado na tabela a seguir:
- Mulheres
 - menos de 15 anos de empresa: +5%
 - de 15 até 20 anos de empresa: +12%
 - mais de 20 anos de empresa: +23%
- Homens
 - menos de 20 anos de empresa: +3%
 - de 20 até 30 anos de empresa: +13%
 - mais de 30 anos de empresa: +25%
 */
fun main () {
    var genero: String
    var novoSalario: Float

    print("Qual o seu nome: ")
    val nome = readln()

    print("Quantos anos você trabalha na empresa: ")
    val anos: Int = readln().toInt()

    print("Qual e seu salario: ")
    val salario: Float = readln().toFloat()

    print("Qual e o seu Genero? ")
    val qualGenero = readln().lowercase()
    while ((qualGenero != "masculino" && qualGenero != "m") && (qualGenero != "feminino" && qualGenero != "f")) {
        println("Por favor, coloque seu genero como MASCULINO ou FEMININO.")
        print("Qual e o seu Genero? ")
        readln().lowercase()
    }
    if (qualGenero == "masculino" || qualGenero == "m") {
        genero = "m"
    } else {
        genero = "f"
    }
    if (genero == "m") {
        if (anos <= 20) {
            novoSalario = salario + ((salario * 3) / 100)
            println("O Funcionario $nome, que tinha o seu salario ${String.format("%.2f", salario)} tera um almento de 3%, então ele receberar ${String.format("%.2f", novoSalario)}")
        } else if ((anos >= 21) || (anos <= 30)) {
            novoSalario = salario+((salario*13)/100)
            println("O Funcionario $nome, que tinha o seu salario ${String.format("%.2f", salario)} tera um almento de 13%, então ele receberar ${String.format("%.2f", novoSalario)}")
        } else {
            novoSalario = salario+((salario+25)/100)
            println("O Funcionario $nome, que tinha o seu salario ${String.format("%.2f", salario)} tera um almento de 25%, então ele receberar ${String.format("%.2f", novoSalario)}")
        }
    }else{
        if (anos <= 20) {
            novoSalario = salario + ((salario * 5) / 100)
            println("A Funcionario $nome, que tinha o seu salario ${String.format("%.2f", salario)} tera um almento de 5%, então ele receberar ${String.format("%.2f", novoSalario)}")
        } else if ((anos >= 21) || (anos <= 30)) {
            novoSalario = salario+((salario*12)/100)
            println("A Funcionario $nome, que tinha o seu salario ${String.format("%.2f", salario)} tera um almento de 12%, então ele receberar ${String.format("%.2f", novoSalario)}")
        } else {
            novoSalario = salario+((salario+23)/100)
            println("A Funcionario $nome, que tinha o seu salario ${String.format("%.2f", salario)} tera um almento de 13%, então ele receberar ${String.format("%.2f", novoSalario)}")
        }
    }
}