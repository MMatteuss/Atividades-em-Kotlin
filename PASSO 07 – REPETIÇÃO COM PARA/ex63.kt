package `PASSO 07 – REPETIÇÃO COM PARA`
//Desenvolva um programa usando a estrutura “para” que mostre na tela a
//seguinte contagem:
//100 90 80 70 60 50 40 30 20 10 0 Acabou!

fun main(){
    for (i in 100 downTo 0 step 10){
        print("$i ")
    }
    print("Acabou!")
}