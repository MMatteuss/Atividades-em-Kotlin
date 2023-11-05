package `PASSO 02 - CONDIÇÕES BÁSICAS`
/*
Faça um algoritmo que pergunte a distância que um passageiro deseja
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
viagens até 200Km e R$0.45 para viagens mais longas.
 */
fun main(){
    print("Qual a distancia que que deseja percorrer: ")
    val distanciaPassageiro: Float = readln().toFloat()
    var passagemPassageiro: Float
    if (distanciaPassageiro<200){
        passagemPassageiro = distanciaPassageiro*0.5F
        println("A viagen de ${distanciaPassageiro}KM, terá o valor de ${passagemPassageiro}R$")
    }else{
        passagemPassageiro = (distanciaPassageiro*0.45F)
        println("A viagen de ${distanciaPassageiro}KM, terá o valor de ${passagemPassageiro}R$")
    }
}
