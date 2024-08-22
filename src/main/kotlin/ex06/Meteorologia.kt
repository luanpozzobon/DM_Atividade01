package ex06

class Meteorologia(var temperaturas: FloatArray) {
    constructor(): this(FloatArray(30))

    fun informarDias() {
        for (i in 0 until  temperaturas.size) {
            print("Informe a temperatura do ${i + 1}º dia: ")

            temperaturas.set(i, readln().toFloat())
        }
    }

    fun calcular() {
        println("Média de temperaturas: ${temperaturas.average()}")
        println("Temperatura Máxima: ${temperaturas.max()} no dia: ${temperaturas.indexOfFirst { it == temperaturas.max() } + 1}")
        println("Temperatura Mínima: ${temperaturas.min()} no dia: ${temperaturas.indexOfFirst { it == temperaturas.min() } + 1}")
    }
}