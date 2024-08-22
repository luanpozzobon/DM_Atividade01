package ex01

fun main() {
    print("Digite um número para verificar se é primo: ")
    val num = readln().toInt()

    val primos = Primos(num)
    primos.verificar()
}