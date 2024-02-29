// Exercicio 4: Buscando elementos do array

fun main () {

    // Array de Strings

    val names = arrayOf("Karina", "Renata", "Kaue", "Matheus")
    val searchName = "Kaue" //elemento a ser buscado
    var found = False // Variavel para verificar se o elemento foi encontrado ou não

    // loop para verificar se o elemento esta presente

    for (name in names) {
        
        if (name == searchName){
            found = true
            break
        }
    }

    if (found) {
        println("$searchName foi encontrado o array.")
    }
    else {
        println("$searchName não foi encontrado o array.")
    }

}