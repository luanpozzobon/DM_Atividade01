package ex02

class Palavras(var paragrafo: String) {
    fun contar() {
        print("O número de palavras no parágrafo é: ${this.paragrafo.split(" ").size}")
    }
}