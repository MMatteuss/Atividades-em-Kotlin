package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
 O programa acima vai ter um problema quando digitarmos o primeiro valor
maior que o último. Resolva esse problema com um código que funcione em qualquer
situação.
 */
fun main(){
    print("Digite o primeiro Valor: ")
    var primeiroValor: Int = readln().toInt()

    print("Digite o último Valor: ")
    var ultimoValor: Int = readln().toInt()

    print("Digite o incremento: ")
    val incremento: Int = readln().toInt()

    print("Contagem: ")

    // if(se os numero forem maior, vai isso)
    if (primeiroValor < ultimoValor){
        while (primeiroValor < ultimoValor){
            print("$primeiroValor ")
            primeiroValor += incremento
        }
    }else{
    // senão, vai isso aqui:
        while (ultimoValor < primeiroValor){
            print("$primeiroValor ")
            primeiroValor -= incremento
        }
    }

    print("Acabou!")
}
