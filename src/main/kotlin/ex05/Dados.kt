package ex05

import kotlin.random.Random

class Dados {
    private var dado1: Int
    private var dado2: Int

    constructor() {
        this.dado1 = 0
        this.dado2 = 0
    }
    fun jogarDados() {
        print("Quantas vezes quer jogar os dados? ")
        val jogadas = readln().toInt()

        this.dado1 = Random.nextInt(1, 7)
        this.dado2 = Random.nextInt(1, 7)

        
    }
}