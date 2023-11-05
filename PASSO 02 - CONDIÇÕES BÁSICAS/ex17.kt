package `PASSO 02 - CONDIÇÕES BÁSICAS`
/*
Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
 */
fun main(){
    print("Qual a velocidade do carro: ")
   val velocidadeKm: Float = readln().toFloat()
   if (velocidadeKm>80){
       val multa : Float = ((velocidadeKm-80)*5)
       println("Você utrapassou a velocidade permetida, então você pagara uma multa de ${multa}R$")
   }else{
       println("Continue assim.")
   }
}
