package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
no final:
a) Qual foi a média de altura do grupo
b) Quantas pessoas pesam mais de 90Kg
c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
 */
fun main(){
    var contador = 0
    var mediaAltura: Float = 0.0F
    var menosCinquentaKg: Int = 0
    var pesamMaisDeNoventa: Int = 0
    var mdemMaisDeUmNoventaEmaisDeCemKg: Int = 0

    while(contador < 7){
        contador++

        print("Qual e o peso da ${contador}º pessoa: ")
        val peso:Float = readln().toFloat()

        print("Qual e a altura da ${contador}º pessoa: ")
        val altura: Float = readln().toFloat()
        println("-----------------------------------------")
        mediaAltura += altura

        if(peso>=90){pesamMaisDeNoventa++}
        if((peso <= 50) and (altura <= 1.60)){menosCinquentaKg++}
        if((altura >= 1.90)and(peso >= 100)){mdemMaisDeUmNoventaEmaisDeCemKg++}
    }
    println("A média de altura do grupo foi de ${mediaAltura/7}m.")
    println("A ${pesamMaisDeNoventa} pessoas que pesam mais de 90kg.")
    println("A ${menosCinquentaKg} pessoas que pesam menos de 50kg tem menos de 1.60m.")
    println("A ${mdemMaisDeUmNoventaEmaisDeCemKg} pessoas que medem mais de 1.90m pasam mais de 100kg.")
}
