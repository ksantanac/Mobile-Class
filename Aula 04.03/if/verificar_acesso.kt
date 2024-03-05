// Exercicio de verificaçõa de acesso. 

// fun main () {
    
//     //
//     val usuario = "vinicius"  // Usuário pré definido 
//     val senha   = "senha1234" //  Senha pré definida 

//     // Verificando se o usuário é valido 
//     if (usuario == "vinicius" && senha == "senha123") {
//         println("Acesso permitido")  //  Se for igual ao usuário e senha correta, será exibido essa mensagem.
//         } else{
//         println("Acesso negado!")    // Se não for usuário e senha correto mostra acesso negado. 
//     }

// }


fun main() {
    // Solicita ao usuário para digitar o nome de usuário
    print("Digite o nome de usuário: ")
    val usuarioInput = readLine()

    // Solicita ao usuário para digitar a senha
    print("Digite a senha: ")
    val senhaInput = readLine()

    val usuario = "vinny"
    val senha = "mudar123"

    // Verifica se o nome de usuário e senha fornecidos correspondem às credenciais definidas
    if (usuarioInput == usuario && senhaInput == senha) {
        println("Acesso permitido.")
    } else {
        println("Acesso negado.")
    }
}