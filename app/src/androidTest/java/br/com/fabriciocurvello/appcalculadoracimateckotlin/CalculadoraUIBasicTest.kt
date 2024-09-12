package br.com.fabriciocurvello.appcalculadoracimateckotlin

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class CalculadoraUIBasicTest {

    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun testTextFieldInput() {
        // Verifica se o campo de texto está permitindo entrada de texto
        pausa(1)
        Espresso.onView(ViewMatchers.withId(R.id.et_numero1)).perform(ViewActions.typeText("5"))
        pausa(2)
        Espresso.onView(ViewMatchers.withId(R.id.et_numero1)).check(ViewAssertions.matches(
            ViewMatchers.withText("5")))
        pausa(2)
    }

    fun pausa(segundos: Long) {
        try {
            Thread.sleep(segundos * 1000)
        } catch (e: InterruptedException) {
            throw RuntimeException(e)
        }
    }
}