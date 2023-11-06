package `PASSO 02 - CONDIÇÕES BÁSICAS`

/*
 [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
de cada lado deve ser menor que a soma dos outros dois
 */
fun main(){
    print("a")
    val a : Int = readln().toInt()
    print("b")
    val b : Int = readln().toInt()
    print("c")
    val c : Int = readln().toInt()

    if ((a< b+c) && (b< a+b) && (c< a+b)){
        println("Poderar foramar um triangulo")
    }else{
        println("Não poderar formar um triangulo")
    }
}
