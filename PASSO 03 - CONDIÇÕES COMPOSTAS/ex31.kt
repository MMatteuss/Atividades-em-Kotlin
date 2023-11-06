package `PASSO 03 - CONDIÇÕES COMPOSTAS`
/*
 [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
 */
fun main(){
    var placarPontos: String
    var continuar: String = "sim"

    var pontosEu: Int = 0
    var pontosMaquina: Int = 0

    while (continuar == "sim" || continuar == "s") {
        println(" ")

            var maquinaJogada: String? = null
            val random1 = (1..3).shuffled().last()
            if (random1 == 1) {
                maquinaJogada = "Pedra"
                maquinaJogada = maquinaJogada.lowercase()
            } else if (random1 == 2) {
                maquinaJogada = "Papel"
                maquinaJogada = maquinaJogada.lowercase()
            } else {
                maquinaJogada = "Tesoura"
                maquinaJogada = maquinaJogada.lowercase()
            }

            print(
                """
                -----------------------    
                        JoKenPo
                -----------------------
                Pedra 
                Papel 
                Tesoura 
                -----------------------
            
                """.trimIndent()
            )
            print("Qual vai ser sua jogada: ")
            var suaJogada: String = readln()
            suaJogada = suaJogada.lowercase()

            while ((suaJogada != "pedra") && (suaJogada != "papel") && (suaJogada != "tesoura")) {
                println("-----------------------")
                println("Ops, você deve ter escrito errado, por favor escreva sua jogada!! (Pedra-Papel-Tesoura)")
                print("Qual vai ser sua jogada: ")
                suaJogada = readln()
                suaJogada = suaJogada.lowercase()
            }



            val delayMillis = 1000 // Define a quantidade de milissegundos de pausa entre os números
            for (i in 1..4) {
                when (i) {
                    1 -> {
                        println("Carregando...")
                    }
                    2 -> {
                        println("Jo")
                    }
                    3 -> {
                        println("Ken")
                    }
                    else -> {
                        println("Po")
                    }
                }
                Thread.sleep(delayMillis.toLong()) // Pausa a execução por um certo período de tempo
            }

            println(
                """
                -----------------------
                      Concluído!
                -----------------------
                """.trimIndent()
            )

            for (j in 1..2) {
                Thread.sleep(delayMillis.toLong())
            }

            if (maquinaJogada == suaJogada) {
                println("Você jogou: $suaJogada, Maquina jogou: ${maquinaJogada} ")
                println("----- IMPATE -----")
            } else if (suaJogada == "pedra" && maquinaJogada == "tesoura") {
                println("Você jogou: $suaJogada, Maquina jogou: ${maquinaJogada} ")
                println("----- VOCÊ GANHOU -----")
                pontosEu++
            } else if (suaJogada == "papel" && maquinaJogada == "pedra") {
                println("Você jogou: $suaJogada, Maquina jogou: ${maquinaJogada} ")
                println("----- VOCÊ GANHOU -----")
                pontosEu++
            } else if (suaJogada == "tisoura" && maquinaJogada == "pedra") {
                println("Você jogou: $suaJogada, Maquina jogou: ${maquinaJogada} ")
                println("----- VOCÊ GANHOU -----")
                pontosEu++
            } else {
                println("Você jogou: $suaJogada, Maquina jogou: ${maquinaJogada} ")
                println("----- VOCÊ PERDEU -----")
                pontosMaquina++
            }

            for (j in 1..2) {
                Thread.sleep(delayMillis.toLong())
            }

            println(" ")
            println("-----------------------")

            print("Deseja ver o placar? [s,n]")
            placarPontos = readln().lowercase()
            if (placarPontos == "sim" || placarPontos == "s") {

                println("Quantidade de pontos:")
                println("Eu: $pontosEu")
                println("Maquina: $pontosMaquina")
            }
        println(" ")
        print("Deseja jogar de novo JoKenPo: [s,n]")
        continuar = readln().lowercase()
        if (continuar == "sim" || continuar == "s") {

            println("===========================")
            println(" ")
            println(" ")
            println(" ")
        }else{
            continuar = "não"
        }
    }
    println("-----------------------")
    println("Obrigado por jogar")
} //test