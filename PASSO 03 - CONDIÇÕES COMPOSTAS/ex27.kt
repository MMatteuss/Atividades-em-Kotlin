package `PASSO 03 - CONDIÇÕES COMPOSTAS`
/*
Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, de acordo com a média atingida:
 - Média até 4.9: REPROVADO
 - Média entre 5.0 e 6.9: RECUPERAÇÃO
 - Média 7.0 ou superior: APROVADO
 */
fun main(){
    print("Qual foi a primeira nota: ")
    val primeiraNota: Float = readln().toFloat()
    print("Qual foi a segunda nota: ")
    val segundaNota: Float = readln().toFloat()
    val media: Float = ((primeiraNota+segundaNota)/2)

    if (media < 5){
        println("REPROVADO, com a media $media")
    }else if ((media >=5) && (media < 7)){
        println("RECUPERAÇÃO, com a media $media")
    }else{
        println("APROVADO, com a media $media")
    }
}
