/**
 * Funções podem ter parâmetros default - Caso não informados, assume o valor especificado.
 */
fun main() {
    endereco(rua = "dfhgdk", estado = "SP")
    // endereco("mata","PE") Erro porque o valor padrão de cidade está na ordem incorreta
}

fun endereco(rua: String, cidade: String = "", estado: String, cep: String = "") {
    println("Rua: $rua")
    println("Cidade: $cidade, $estado - $cep")
}