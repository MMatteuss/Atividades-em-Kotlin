package `PASSO 03 - CONDIÇÕES COMPOSTAS`
/*
 [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
de triângulo será formado:
 - EQUILÁTERO: todos os lados iguais
 - ISÓSCELES: dois lados iguais
 - ESCALENO: todos os lados diferentes
 */
fun main(){
    print("Digite um valor para o ponto A: ")
    val a : Int = readln().toInt()
    print("Digite um valor para o ponto B: ")
    val b : Int = readln().toInt()
    print("Digite um valor para o ponto C: ")
    val c : Int = readln().toInt()

    if ((a< b+c) && (b< a+b) && (c< a+b)){
        println("Poderar foramar um triangulo")

        if ((a==b) && (b==c) && (a==c)){
            println("O tipo de triângulo será formado: EQUILÁTERO")
        }else if ((a==b) || (b==c) || (a==c)){
            println("O tipo de triângulo será formado: ISÓSCELES")
        }else if ((a!=b) && (b!=c) && (a!=c)){
            println("O tipo de triângulo será formado: ESCALENO")
        }

    }else{
        println("Não poderar formar um triangulo")
    }
}
