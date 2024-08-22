package ex07

class Voo(var numeroDoVoo: Int, var assentosDisponiveis: Array<Int>) {
    fun reservarAssento(assento: Int): Boolean {
        val temp = assentosDisponiveis.toMutableList()
        return temp.remove(assento)
    }
}