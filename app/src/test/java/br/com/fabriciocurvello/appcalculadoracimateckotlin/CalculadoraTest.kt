package br.com.fabriciocurvello.appcalculadoracimateckotlin

import org.junit.Assert
import org.junit.Test

class CalculadoraTest {

    @Test
    fun adicaoTest() {
        val calculadora = Calculadora()
        val resultado = calculadora.calcular(2.0, 3.0, "Adição")
        Assert.assertEquals(5.0, resultado, 0.01)
    }
}