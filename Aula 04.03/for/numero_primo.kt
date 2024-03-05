fun main() {
    val num = 20 // Altere o valor de num conforme necessário
    var isPrime = true

    // Usando o loop for para verificar se um número é primo, para cada I  começando em 2 e indo até 17
    for (i in 2 until num) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }

    if (isPrime) {
        println("$num é primo.")
    } else {
        println("$num não é primo.")
    }
}