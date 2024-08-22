package ex01

class Primos(var num: Int) {
    fun verificar() {
        var qntDivisores: Int = 0
        for (i in 1..this.num) {
            if (this.num % i == 0)
                ++qntDivisores

            if (qntDivisores > 2) break
        }

        print("\nO número: ${this.num}${if (qntDivisores > 2) " não" else ""} é primo")
    }
}