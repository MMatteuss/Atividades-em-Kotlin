package `PASSO 03 - CONDIÇÕES COMPOSTAS`
/*
Um programa de vida saudável quer dar pontos atividades físicas que podem
ser trocados por dinheiro. O sistema funciona assim:
 - Cada hora de atividade física no mês vale pontos
 - até 10h de atividade no mês: ganha 2 pontos por hora
 - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
 - acima de 20h de atividade no mês: ganha 10 pontos por hora
 - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
 */
fun main(){
    var pontosSaude : Int
    var pontosSaudeCalculos : Float
    var valorEmDinheiro: Float

    print("Quantas horas por mês você pratica que você pratica ativiadades físicas: ")
    val horasFisicaPorMes : Float = readln().toFloat() // Vale 1 ponto Cada hora de Atividade Física
    if (horasFisicaPorMes == 0.0.toFloat()){
        pontosSaudeCalculos = (horasFisicaPorMes*2)
        pontosSaude = (horasFisicaPorMes*1).toInt()
        valorEmDinheiro = (0.05.toFloat())*pontosSaudeCalculos
        println("O total de pontos de Saúde é: $pontosSaude, e você receberá no total ${String.format("%.2f", valorEmDinheiro)}R$")
    }
    else if (horasFisicaPorMes <= 10){
        pontosSaudeCalculos = (horasFisicaPorMes*2)
        pontosSaude = (horasFisicaPorMes*1).toInt()
        valorEmDinheiro = (0.05.toFloat())*pontosSaudeCalculos
        println("O total de pontos de Saúde é: $pontosSaude, e você receberá no total ${String.format("%.2f", valorEmDinheiro)}R$")
    } else if (horasFisicaPorMes <= 20){
        pontosSaudeCalculos = (horasFisicaPorMes*5)
        pontosSaude = (horasFisicaPorMes*5).toInt()
        valorEmDinheiro = (0.05.toFloat())*pontosSaudeCalculos
        println("O total de pontos de Saúde é: $pontosSaude, e você receberá no total ${String.format("%.2f", valorEmDinheiro)}R$")
    }else{
        pontosSaudeCalculos = (horasFisicaPorMes*10)
        pontosSaude = (horasFisicaPorMes*10).toInt()
        valorEmDinheiro = (0.05.toFloat())*pontosSaudeCalculos
        println("O total de pontos de Saúde é: $pontosSaude, e você receberá no total ${String.format("%.2f", valorEmDinheiro)}R$")

    }
}
