package ex03

class Aluno(var nome: String, var notas: FloatArray) {
    constructor(nome: String): this(nome, FloatArray(3))

    fun verificarMedia() {
        val media = notas.average();
        println("O aluno ${this.nome} obteve média $media e${if (media < 7.0) " não" else ""} foi aprovado")
    }
}