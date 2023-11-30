package `PASSO 05 – ENQUANTO COM FLAG`
/*
Crie um programa que mostre na tela a seguinte contagem, usando a estrutura
“faça enquanto”
0 3 6 9 12 15 18 21 24 27 30 Acabou!
 */
fun main (){
    var contar = -3
    do {
        contar+=3
        print("$contar ")

    } while (contar < 30)
    print("Acabou!")
}