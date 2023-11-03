fun main(args: Array<String>){
    print("Digite sua nota 1: ")
    var notaUm = readLine()!!.toFloat()
    print("Digite sua nota 2: ")
    var notaDois = readLine()!!.toFloat()
    var media = ((notaUm+notaDois)/2)

    println("A Media entre $notaUm e $notaDois é igual a $media")
}