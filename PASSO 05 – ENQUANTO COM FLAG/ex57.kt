package `PASSO 05 – ENQUANTO COM FLAG`
/*
Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
No final, mostre o total de salários pagos aos homens e o total pago às
mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
sempre que ler os dados de um funcionário.
 */
fun main(){
    var homem: Float = 0.0f
    var mulher: Float = 0.0f
    var salarial: Float = 0.0F
    var continuar: String = "s"

    println("Leitor de dados de funcionario")
    while (continuar == "s"){
        print("Qual e o salário desse funcionario: ")
        salarial = readln().toFloat()

        print("Qual e o sexo desse funcionario: [m, f] ")
        var genero: String = readln().lowercase()

        if(genero == "m"){
            mulher = mulher + salarial
        }else{
            homem = homem + salarial
        }

        print("Deseja continuar? [s,n] ")
        continuar = readln().lowercase()
        println(" ")
    }
    val mulheresSlarios = "%.2f".format(mulher)
    val homemsSalarios = "%.2f".format(homem)

    println("O total de sálarios pagos para as mulheres foi ${mulheresSlarios}R$")
    println("O total de sálarios pagos para as homem foi ${homemsSalarios}R$")
}
