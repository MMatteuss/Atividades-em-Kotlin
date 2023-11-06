package `PASSO 03 - CONDIÇÕES COMPOSTAS`
/*
Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
devemostrar a classificação desse terreno, de acordo com a lista abaixo:
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP
 */
fun main(){
    print("Qual o valor da largura do terreno: ")
    val larguraTerreno: Float = readln().toFloat()
    print("Qual o valor do compremento do terreno: ")
    val comprementoTerreno: Float = readln().toFloat()
    val metrosTerreno: Float = (larguraTerreno*comprementoTerreno)

    if (metrosTerreno < 100){
        println("TERRENO POPULAR com ${metrosTerreno.toString().replace(".0", "")}m²")
    }else if ((metrosTerreno >= 100) && (metrosTerreno <= 500)){
        println("TERRENO MASTER com ${metrosTerreno.toString().replace(".0", "")}m²")
    }else{
        println("TERRENO VIP com ${metrosTerreno.toString().replace(".0", "")}m²")
    }
}