package ex08

fun main() {
    for (i in 1..5) {
        println("Cadastre o ${i}º produto:")
        print("Nome: ")
        var nome = readln()

        print("Quantidade: ")
        var quantidade = readln().toInt()

        print("Nível Mínimo: ")
        var nivelMinimo = readln().toInt()

        print("Nível Máximo: ")
        var nivelMaximo = readln().toInt()

        var produto = Produto(nome, quantidade, nivelMinimo, nivelMaximo)

        if (produto.estoqueAbaixo()) {
            produto.reporEstoque()
            println("Estoque Reposto! Quantidade: ${produto.quantidade}")
        }
    }
}