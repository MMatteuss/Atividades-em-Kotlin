package `PASSO 02 - CONDIÇÕES BÁSICAS`
/*
 Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
não um bom aproveitamento (se ficou acima da média 7.0)
 */
fun main(){
    print("Qual o nome do aluno: ")
    val nomeAluno : String = readln()
    print("Qual foi sua primeira nota: ")
    val primeiraNota : Float = readln().toFloat()
    print("Qual foi sua segunda nota: ")
    val segundaNota : Float = readln().toFloat()

    val mediaNotas : Float = ((primeiraNota+segundaNota)/2)

    if (mediaNotas >=7){
        print("O aluno $nomeAluno, teve um bom aproveitamento, a media foi $mediaNotas")
    }else{
        print("O aluno $nomeAluno, não teve um bom aproveitamento, a media foi $mediaNotas")
    }
}
