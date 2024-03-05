//Exercicio  - Pré e Pós Incremento
fun main() {
    println("Pré-incremento e Pós-incremento\n")

    var contador = 5

    println("Valor inicial do contador: $contador")

    // Pré-incremento: Incrementa a variável e depois a utiliza
    val resultadoPreIncremento = ++contador // contador é incrementada primeiro e depois seu valor é utilizado na expressão.
    println("Após pre-incremento, contador = $contador e resultado = $resultadoPreIncremento")

    contador = 5 // Resetamos o contador

    // Pós-incremento: Utiliza a variável e depois a incrementa
    val resultadoPosIncremento = contador++ // contador é utilizado na expressão e só depois é incrementado.
    println("Após pos-incremento, contador = $contador e resultado = $resultadoPosIncremento")

    // Pré-incremento é igual a:
    // contador = contador + 1
    // resultadoPreIncremento = contador
    // Pós-incremento é igual a:
    // resultadoPosIncremento = contador
    // contador = contador + 1
}