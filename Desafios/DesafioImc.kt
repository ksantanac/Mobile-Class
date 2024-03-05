// 1. Criar um objeto Scanner para ler a entrada do usuário.
// 2. Definir uma função chamada coletarDados() que solicite e leia o peso e aaltura do usuário.
// 3. Calcular o IMC utilizando a fórmula IMC = peso / (altura * altura).

// Utilizar uma estrutura when para determinar a categoria do IMC com basenos seguintes critérios:
// IMC < 18.5: Excesso de Magreza
// 18.5 <= IMC < 25: Peso Normal
// 25 <= IMC < 30: Excesso de Peso
// 30 <= IMC < 35: Obesidade - Grau I
// 35 <= IMC < 40: Obesidade - Grau II
// IMC >= 40: Obesidade - Grau III
// Exibir o resultado do IMC com duas casas decimais e a categoriacorrespondente.
// Obs.: O programa deve permitir ao usuário continuar ou sair após cada cálculo do IMC.
// Escreva o código

// Para executar o código Kotlin e ver a saída, você precisará de um ambiente de desenvolvimento ou 
// compilador Kotlin instalado em seu sistema. Aqui estão os passos básicos para executar ocódigo:

fun main() {
    coletarDados()
}

fun coletarDados() {
    println("Digite seu peso em KG: ")
    val peso = readLine()!!.toDouble() 

    println("Digite sua altura: ")
    val altura = readLine()!!.toDouble() 


    println(peso)
}

fun main() {
    val peso = coletarDados()
    println(peso)

}