fun analisarIdade(idade: Int) {
    val mensagem = when {
        idade < 18 -> "Menor de idade"
        idade in 18..64 -> "Adulto"
        else -> "Idoso"
    }
    println(mensagem)
}