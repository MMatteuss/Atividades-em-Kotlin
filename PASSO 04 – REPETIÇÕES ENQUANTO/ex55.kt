package `PASSO 04 – REPETIÇÕES ENQUANTO`
/*
 [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de
agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
tentativas para tentar acertar.
 */

fun main(){
    var jogarDeNovo: Int = 4
    var verTabela : String = "não"
    val delayMillis = 1000
    var numeroQueTalvezEuEstejaPensando: Int
    var pontosJogador : Int = 0
    var tentativas : Int = 0


    while ((jogarDeNovo >0 ) && (jogarDeNovo <= 4)) {
        val random1 = (1..10).shuffled().last()
        println("---------------------------------------")
        println("       Tente adivinhar o número        ")
        println("---------------------------------------")

        println("De 1 a 10 e você tem $jogarDeNovo tentativas")
        print("Qual o número que estou pensado: ")

        numeroQueTalvezEuEstejaPensando = readln().toInt()
        while ((numeroQueTalvezEuEstejaPensando >= 11) && (numeroQueTalvezEuEstejaPensando < 0)) {
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
            jogarDeNovo ++
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
            println("Você ainda tem: ${jogarDeNovo} Tentativas")
            println("----------------------")
        } else {
            println("---------------------------------------")
        }
        if(jogarDeNovo == 0){
            println("Infelizmente suas tentativas acabaram. Reinicie o jogo!")
        }

        println(" ")
        println(" ")


    }
}

