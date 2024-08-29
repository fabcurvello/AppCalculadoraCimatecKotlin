package br.com.fabriciocurvello.appcalculadoracimateckotlin

class Calculadora {

    fun calcular(n1: Double, n2: Double, operacao: String?): Double {
        return when (operacao) {
            "Adição" -> n1 + n2
            "Subtração" -> n1 - n2
            "Multiplicação" -> n1 * n2
            "Divisão" -> if (n2 != 0.0) n1 / n2 else Double.NaN
            else -> Double.NaN
        }
    }
}
