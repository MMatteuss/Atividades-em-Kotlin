package `PASSO 05 – ENQUANTO COM FLAG`
/*
Crie um programa que leia vários números pelo teclado e mostre no final o
somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado
 */
fun main(){
    val seNumeroDigitado: Int = 1111
    var somador: Int = 0
    var numeroDigitado: Int = 0

    while (numeroDigitado != seNumeroDigitado){
        print("Digite um número (ou 1111 para encerrar): ")
        numeroDigitado = readln().toInt()
        somador = somador + numeroDigitado
    }
    println("A soma dos número digitados e igual a ${somador-seNumeroDigitado}")
}
