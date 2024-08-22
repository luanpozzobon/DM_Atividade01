package ex08

class Produto(var nome: String, var quantidade: Int, var nivelMinimo: Int, val nivelMaximo: Int) {
    fun estoqueAbaixo(): Boolean {
        return quantidade < nivelMinimo
    }

    fun reporEstoque() {
        quantidade = nivelMaximo
    }
}