package execicios

fun main(){
    print("Qual o nome do Produto: ")
    val nomeProduto: String = readln()
    print("Qual e o valor do Produto $nomeProduto: ")
    val precoProduto: Float = readln().toFloat()
    val descontoProsuto: Float = (precoProduto-((precoProduto*5)/100))
    println("O $nomeProduto que custa $precoProduto, com 5% de desconto ficara $descontoProsuto")
}