//Desenvolva um programa usando a estrutura “para” que mostre na tela a
//seguinte contagem:
//0 5 10 15 20 25 30 35 40 Acabou!

fun main() {
    // Itera sobre um intervalo de 1 a 5 usando for
    for (i in 0..40 step 5){
        print("$i ")
    }
    print("Acabou!")
}