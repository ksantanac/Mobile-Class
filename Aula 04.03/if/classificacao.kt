fun main() {

    val numero = 0 // definindo o valor do numero a ser verificado

    if (numero > 0) {
        println("o numero é positivo") // Se verdadeiro imprime essa mensagem 
    } else if (numero < 0) {
        
        println("o numero é negativo") // 

    } else {

        println("o numero é zero") // Se nenuma das condiçõe anteriores for verdadeira.
    }

}


// numero % 2 == 0 
// se o resto da divisão por  2 for igual a zero, é par.

fun main() {

    var num = 3

    if (num % 2 == 0) {
        println("O número é par.")
    }else {
        println ("O número é impar.")
    }
}