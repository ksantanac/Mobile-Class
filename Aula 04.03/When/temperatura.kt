fun classificarClima(temperatura: Int) {
    val clima = when {
        temperatura < 10 -> "Frio"
        temperatura in 10..35 -> "Moderado"
        else -> "Inferno de quente"
    }
    println("O clima está classificado como: $clima")
}

fun main() {
    val temperatura = 18
    classificarClima(temperatura)
}