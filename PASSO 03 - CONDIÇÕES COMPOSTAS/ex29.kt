package `PASSO 03 - CONDIÇÕES COMPOSTAS`
/*
Desenvolva um programa que leia o nome de um funcionário, seu salário,
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
acordo com a tabela a seguir:
 - Até 3 anos de empresa: aumento de 3%
 - entre 3 e 10 anos: aumento de 12.5%
 - 10 anos ou mais: aumento de 20%
 */
fun main(){
    print("Qual o nome do funcionario: ")
    val nomeFuncionario: String = readln()
    print("Qual o salario do funcionario: ")
    val salarioFuncionario: Float = readln().toFloat()
    print("Quantos anos $nomeFuncionario trabalha na empresa: ")
    val anosEmpresa: Int = readln().toInt()
    var novoSalarioFuncionario: Float

    if (anosEmpresa <3){
        novoSalarioFuncionario = (((salarioFuncionario*3)/100)+salarioFuncionario)
        println("O funcionario $nomeFuncionario tera um almento de 3%, e ficara com o salario de ${novoSalarioFuncionario}R$")
    }else if ((anosEmpresa >3) && (anosEmpresa<10)){
        novoSalarioFuncionario = (((salarioFuncionario*12.5)/100)+salarioFuncionario).toFloat()
        println("O funcionario $nomeFuncionario tera um almento de 12,5%, e ficara com o salario de ${novoSalarioFuncionario}R$")
    }else{
        novoSalarioFuncionario = (((salarioFuncionario*20)/100)+salarioFuncionario)
        println("O funcionario $nomeFuncionario tera um almento de 20%, e ficara com o salario de ${novoSalarioFuncionario}R$")
    }
}
