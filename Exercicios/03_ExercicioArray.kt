// Exercicio 3: Média dos elementos

fun main () {

    val values = doubleArrayOf(12.5, 9.8, 15.2, 18.7, 20.0) // Array de double
    var sum = 0.0 // Variavel para armazenar a som

    // Loop para somar os elemntos de array

    for (value in values) {
        sum += value
    }

    val average = sum / values.size // Calculo da média
    println("A media é $average") //impressão da média

}