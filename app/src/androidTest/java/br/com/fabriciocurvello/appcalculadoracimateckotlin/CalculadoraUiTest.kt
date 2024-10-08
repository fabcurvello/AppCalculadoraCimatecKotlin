package br.com.fabriciocurvello.appcalculadoracimateckotlin

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class CalculadoraUiTest {


    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun AdicaoTestUi() {
        Espresso.onView(ViewMatchers.withId(R.id.et_numero1)).perform(ViewActions.replaceText("2"))
        pausa(1)
        Espresso.onView(ViewMatchers.withId(R.id.et_numero2)).perform(ViewActions.replaceText("3"))
        pausa(1)
        Espresso.onView(ViewMatchers.withId(R.id.sp_operacao)).perform(ViewActions.click())
        pausa(1)
        Espresso.onView(ViewMatchers.withText("Adição")).perform(ViewActions.click())
        pausa(1)
        Espresso.onView(ViewMatchers.withId(R.id.bt_calcular)).perform(ViewActions.click())
        pausa(1)
        Espresso.onView(ViewMatchers.withId(R.id.tv_resultado)).check(ViewAssertions.matches(ViewMatchers.withText("5.0")))
        pausa(3)
    }

    //Elabore testes de integração para subtração, multiplicação e divisão

    fun pausa(segundos: Long) {
        try {
            Thread.sleep(segundos * 1000)
        } catch (e: InterruptedException) {
            throw RuntimeException(e)
        }
    }
}
