package ex02

fun main() {
    print("Digite um parágrafo: ")
    val paragrafo = readln()

    val palavras = Palavras(paragrafo)
    palavras.contar();
}