// Exercicio 2: Maior e Menor Elemento

fun main () {

    val numbers = intArrayOf(8, 3, 12, 5, 20)

    // Variaveis para armazenar maior e menor elemento
    var max = numbers[0]
    var min = numbers[0]

    // Loop para encontrar o menor e o maior elemento
    for (number in numbers) {

        if (number < min) {
            min = number
        }

        if (number > max) {
            max = number
        }

    }

    println("O menor elemento é: $min")
    println("O maior elemento é: $max")

}