package `PASSO 02 - CONDIÇÕES BÁSICAS`
/*
Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que:
 - Homens ganham 5% de desconto
 - Mulheres ganham 13% de desconto
 */
fun main(){
    var desconto: Float
    var descontos: String

    print("Qual o nome do produto: ")
    val produto: String = readln().trim()

    print("Quanto e o valor do ${produto}: ")
    val valorProduto: Float = readln().toFloat()

    print("Qual e o seu genero: ")
    val genero: String = readln().toUpperCase().trim()

    if ((genero == "M") || (genero == "MASCULINO") || (genero == "HOMEM") || (genero == "H")){
        desconto = (((valorProduto*5)/100)-valorProduto)*-1
        descontos = desconto.toString()
        println("O produto $produto, estara com um desconto de 5%, que ficara com o valor de ${descontos.replace(".", ",")}0R$")
    }else if ((genero == "F") || (genero == "FEMININO") || (genero == "MULHER") || (genero == "M")){
        desconto = (((valorProduto*15)/100)-valorProduto)*-1
        descontos = desconto.toString()
        //print(descontos.replace(".", ","))
        println("O produto $produto, estara com um desconto de 15%, que ficara com o valor de ${descontos.replace(".", ",")}0R$")
    }else{
        descontos = valorProduto.toString()
        println("O produto $produto, com o valor de ${descontos.replace(".", ",")}0R$")
    }
}
