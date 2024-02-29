// Exercicio 1: Soma dos elementos

fun main() {

    // Array de inteiros
    val numbers = intArrayOf(5, 10, 15, 20, 25) // imutavel
    var sum = 0 // variavel para armazenar a soma // mutável

    //Loop para somar os elementos do array
    for (number in numbers) {
        sum += number
    }

    // Imprimindo o resultado
    println(" A soma dos elementos é: $sum")

}