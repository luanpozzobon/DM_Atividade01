package ex04

class Alunos(var nomes: List<String>) {
    constructor(): this(emptyList())

    fun adicionarAlunos() {
        val nomes = mutableListOf<String>()

        for (i in 1..10) {
            print("Digite o nome do ${i}º aluno: ")
            nomes.add(readln())
        }

        this.nomes = nomes;
    }
    fun mostrarListaOrdenada() {
        println(nomes.sorted().joinToString(separator = "\n"))
    }
}