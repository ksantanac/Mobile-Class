//Execicio - maior ou menor de idade

// fun main () { 

//     val idade = 16

//     if (idade >= 18) {
//         println("Maior de Idade já pode dirigir.")
//         } else {
//             println("Menor de Idade,  não pode dirigir ainda.")
//     }
// }


//====================Recebendo parametros do usuário =====================

fun main() {

    //Solicitando ao usuário para digitar a sua idade. 
    print("Digite sua idade: ")
    val idadeInput = readLine() // Lê a entrada do usuário como uma string "I" 

    //Verificar se a entrada da idade é nula 
   if (idadeInput == null) {
    
    println("Entrada inválida")
    return  // sai da função main se a entrada for nula  
   }

    // Tenta converter a entrada de idade para um valor númerico 
    val idade  = idadeInput.toIntOrNull()

    //Verfificar se a conversão foi sucesso ou se a entrada é inválida 
    if(idade == null){
        println("Entrada Inválida! ESTA VAZIA.")
        return // Sai da função main se a conversão não for sucesso. 
    }

    //Verficar se a idade é mair ou igual a 18 
    if (idade >= 18) {
        println("Você é maior de idade")
    }else {
        println("Você é menor de idade")
    }
}