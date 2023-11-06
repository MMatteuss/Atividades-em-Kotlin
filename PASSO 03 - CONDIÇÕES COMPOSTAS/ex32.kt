package `PASSO 03 - CONDIÇÕES COMPOSTAS`
/*
 Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
jogador vai tentar descobrir qual foi o valor sorteado.
 */
fun main(){
    var jogarDeNovo: String = "sim".lowercase()
    var verTabela : String = "não"
    val delayMillis = 1000
    var numeroQueTalvezEuEstejaPensando: Int
    var pontosJogador : Int = 0
    
    while ((jogarDeNovo == "sim") || (jogarDeNovo == "s")) {
        val random1 = (1..5).shuffled().last()
        println("---------------------------------------")
        println("       Tente adivinhar o número        ")
        println("---------------------------------------")

        print("Qual o número que estou pensado: ")

        numeroQueTalvezEuEstejaPensando = readln().toInt()
        while ((numeroQueTalvezEuEstejaPensando >= 6) && (numeroQueTalvezEuEstejaPensando <= 0)) {
            println("Por favor coloque número entre 1 á 5")
            numeroQueTalvezEuEstejaPensando = readln().toInt()
        }

        println("Carregando... Aguarde...")
        for (i in 1..3) {
            Thread.sleep(delayMillis.toLong())
        }
        for (i in 1..3) {
            println("${i}...")
            Thread.sleep(delayMillis.toLong())
        }

        println("O número que eu pensei foi...")

        for (i in 1..2) {
            Thread.sleep(delayMillis.toLong())
        }
        println("---------------------------------------")
        if (random1 == numeroQueTalvezEuEstejaPensando) {
            println("O número que eu estava pensando era $random1")
            println("Parabens você ganhou")
            pontosJogador++
        } else {
            println("O número que eu estava pensando era $random1")
            println("Infelizmente você perdeu")
            pontosJogador--
        }
        println("---------------------------------------")
        println(" ")

        print("Deseja ver a Tabela de pontos: [s,n]: ")
        verTabela = readln().lowercase()
        if ((verTabela == "sim") || (verTabela == "s")) {
            println("--------Tabela--------")
            println("Meus pontos: $pontosJogador")
            println("----------------------")
        } else {
            println("---------------------------------------")
        }
        println("Jogar Novamente [s,n]: ")
        jogarDeNovo = readln().lowercase()
        println(" ")
        println(" ")
        println(" ")
    }
}
