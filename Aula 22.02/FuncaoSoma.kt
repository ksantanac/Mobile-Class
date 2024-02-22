// Desafio soma de dois quadrados

fun somaQuadrado(a: Int, b: Int): Int {

    // Calcula o quadrado de 'a' e armezana o resultado na varialve 'Quadrado'
    val  quadradoA = a * a

    // Retorna a soma dos quadrados de 'a' e 'b'
    val quadradoB = b * b 

    // Retorna a soma dos quadrados 
    return quadradoA + quadradoB

}


fun main() {

    val a = 3 // valor de a
    val b = 4 // valor de b
    
    val resultado = somaQuadrado(a, b) // Chamada da função
    println("O resultado do quadrado de ${a} e ${b} igual a ${resultado}") // imprima o resuldado

}