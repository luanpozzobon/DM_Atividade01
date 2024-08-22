package ex07

fun main() {
    val voo = Voo(123, arrayOf(1, 3, 9, 11, 12, 20, 21, 23, 17))

    var assento = 7
    println("Assento: $assento${if (voo.reservarAssento(assento)) "" else " não"} reservado")

    assento = 11
    println("Assento: $assento${if (voo.reservarAssento(assento)) "" else " não"} reservado")
}