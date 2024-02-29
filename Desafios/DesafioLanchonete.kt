fun main () {
    

    var coxinha: Double = 5.00
    var cerveja: Double = 15.00
    var taxa: Double = 0.1 

    var somatoria = (coxinha * 3) + (cerveja * 2)
    var taxa_final = somatoria * taxa

    var precoCoxinha = coxinha * 3
    var precoCerveja = cerveja * 2

    var precoFinal = somatoria + taxa_final

    println("-----------------------------")
    println("     Lanchonete do Kaue      ")
    println("-----------------------------")

    println("3 coxinhas           R$ $precoCoxinha")
    println("2 cervejas           R$ $precoCerveja")
    println("Somatoria            R$ $somatoria")
    println("Taxa                 R$ $taxa_final")

    println("-----------------------------")

    println("Conta Final          0R$ $precoFinal")

}