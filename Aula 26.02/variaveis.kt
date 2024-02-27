// fun main () {

//     val nome = "Kaue" // variavel tipo string  // mutavel
//     var idade = 41    // variavel do tipo int     // não mutavel
//     println("Nome: $nome, Idade: $idade")

// }

// fun main() {
//     var numeroInteiro: Int = 10
//     var numeroDecimal: Double = 3.14
//     var texto: String =  "Olá Mundo!"
//     var status: Boolean = true
    
//     println("Número Intero: $numeroInteiro")
//     println("Número Decimal: $numeroDecimal")
//     println("Texto: $texto")
    
// }


// Variáveis com tipo de dados
// Char, BYTE, Short, Long

// fun main () {
//     val numeroInteiro: Int = 10
//     val numeroLong: Long = 10000000
//     val numeroDecimal: Double = 211.14
//     val caractere: Char = 'V'
//     val texto: String = "Kotlin também serve para back end"
//     val verdadeiro: Boolean = true

//     println("Interio $numeroInteiro")
//     println("Long $numeroLong")
//     println("Deciml $numeroDecimal")
//     println("Caractere $caractere")
//     println("Texto $texto")
//     println("Verdadeiro $verdadeiro")

// }



// Multabilidde e Imutabilidade no contexto de var e val

fun main() {

    val imutavel: Int = 5 // imutavel
    var mutavel: Int = 10 // mutable

    mutavel = 15 // ok
    imutavel = 20 // Erro! Não pode atribuir um valor a uma variavel declarada como imutavel

    println("Antes da alteração o valor é $imutavel")
    println("Depois da alteração o valor é $mutavel")
}