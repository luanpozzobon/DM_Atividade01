package ex03

fun main() {
    val alunos = mutableListOf<Aluno>()

    for (i in 1..5) {
        print("Digite o nome do ${i}º aluno: ")
        val nome = readln()

        val aluno = Aluno(nome)
        alunos.add(aluno)

        for (j in 1..3) {
            print("Digite a ${j}ª nota de ${aluno.nome}: ")
            aluno.notas.set(j - 1, readln().toFloat())
        }
    }

    for (aluno in alunos) {
        aluno.verificarMedia()
    }
}