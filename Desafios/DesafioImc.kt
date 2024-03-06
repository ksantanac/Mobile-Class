// 1. Criar um objeto Scanner para ler a entrada do usuário.
// 2. Definir uma função chamada coletarDados() que solicite e leia o peso e altura do usuário.
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


fun coletarDados(): Pair<Double, Double> {

    println("-----------------------------")
    println("       Calculo IMC      ")
    println("-----------------------------")

    println("Digite seu peso em KG: ")
    val peso = readLine()!!.toDouble()

    println("")

    println("Digite sua altura: ")
    val altura = readLine()!!.toDouble()

    println("")

    return peso to altura
}


fun classificarIMC(imc: Double) {
    val peso = when {
        imc < 18.5 -> "Excesso de Magreza"
        imc < 25 -> "Peso Normal"
        imc < 30 -> "Excesso de Peso"
        imc < 35 -> "Obesidade - Grau I"
        imc < 40 -> "Obesidade - Grau II"
        else -> "Obesidade - Grau III"
    }
    println("-----------------------------")
    println("Seu IMC é: $imc")
    println("Você está com a condição de: $peso")
    println("-----------------------------")
}



fun main() {

    while (true) {

        val (peso, altura) = coletarDados()

        val calculoImc = peso / (altura * altura)

        classificarIMC(calculoImc)

        println("Deseja calcular o IMC novamente? (S/N)")
        val resposta = readLine()?.uppercase()

        if (resposta != "S") {
            break
        }
    }
}
