//Crie um programa que preencha automaticamente (usando lógica, não apenas
//atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
//5 10 15 20 25 30 35 40 45 50
//0 1 2 3 4 5 6 7 8 9


fun main() {
    val numero = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (numeros in numero) {
        if (numeros != 0){
            print("${numeros*5} ")
        }
    }
    println(" ")
    for (i in numero){
        if(i != 10) {
            print("$i  ")
        }
    }
}