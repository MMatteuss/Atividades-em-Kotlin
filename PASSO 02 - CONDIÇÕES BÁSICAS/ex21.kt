package `PASSO 02 - CONDIÇÕES BÁSICAS`
/*
Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO.
 */
fun main (){
    print("Qual um ano ")
    val ano: Int = readln().toInt()

    /*
    val bissextoD4 : Int = ano%4
    val bissextoD100 : Int = ano%100
    val bissextoD400 : Int = ano%400
     */

    //if (bissextoD4 == 0 || bissextoD100 == 0 || bissextoD400 == 0){
    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            println("O ano $ano e BISSEXTO")
    }else{
            println("O ano $ano não é BISSEXTO")
    }
}

