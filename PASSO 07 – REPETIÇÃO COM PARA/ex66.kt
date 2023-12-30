package `PASSO 07 – REPETIÇÃO COM PARA`

import java.security.Principal

//Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
//“para”. No final, mostre na tela:
//a) Quantas mulheres foram cadastradas
//b) Quantos homens pesam mais de 100Kg
//c) A média de peso entre as mulheres
//d) O maior peso entre os homens

fun main(){
    var mulheres:Int =0
    var homemsPessados:Int=0
    var pessoMulher: Float = 0.0.toFloat()
    var maiorPesoHomens: Float = 0.0.toFloat()

    for(i in 1..8){
        print("Qual o o sexo [m, f]: ")
        val sex: String = readln().lowercase()

        while ((sex != "m") and (sex != "f")){
            print("Qual o o sexo [m, f]: ")
            val sex: String = readln().lowercase()
        }

        print("Qual e o peso dessa pessoa: ")
        val peso: Float = readln().toFloat()

        if ((sex == "m") and (peso >= 100.00.toFloat())){
            homemsPessados++
            if (peso > maiorPesoHomens){
                maiorPesoHomens = peso
            }
        }

        if (sex == "f"){
            mulheres++
            pessoMulher = peso
        }

        if (i == 8){
            println("fim")
        }
        println(" ")
    }
    println("Foram cadastradas $mulheres mulheres")
    println("A $homemsPessados que pesam mais de 100Kg")
    println("A média dos pesos das mulheres é ${pessoMulher/mulheres}0Kg")
    println("O maior peso dos homens é ${maiorPesoHomens}0Kg")
}