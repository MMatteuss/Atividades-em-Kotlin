//Faça um programa que preencha automaticamente um vetor numérico com 8
//posições, conforme abaixo:
//999 999 999 999 999 999 999 999
//0 1 2 3 4 5 6 7

fun main() {
    val v: Int = 8
    val n = IntArray(v)

    for(i in 0..<v){
        n[i] = 999
        print("${ n[i] } ")
    }
    println(" ")
    for (i in 0..<v){
        print(" $i  ")
    }
}
