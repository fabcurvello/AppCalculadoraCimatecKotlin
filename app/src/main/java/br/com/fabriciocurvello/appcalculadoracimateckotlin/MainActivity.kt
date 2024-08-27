package br.com.fabriciocurvello.appcalculadoracimateckotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var etNumero1: EditText
    lateinit var etNumero2: EditText
    lateinit var spOperacao: Spinner
    lateinit var btCalcular: Button
    lateinit var tvResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        etNumero1 = findViewById(R.id.et_numero1)
        etNumero2 = findViewById(R.id.et_numero2)
        spOperacao = findViewById(R.id.sp_operacao)
        btCalcular = findViewById(R.id.bt_calcular)
        tvResultado = findViewById(R.id.tv_resultado)

        btCalcular.setOnClickListener {

            var num1 = etNumero1.text.toString().toDoubleOrNull()
            var num2 = etNumero2.text.toString().toDoubleOrNull()

            val operacao = spOperacao.selectedItem.toString()

            if ((num1 != null) && (num2 != null)) {
                var resultado = 0.0
                when (operacao) {
                    "Adição" -> resultado = num1 + num2
                    "Subtração" -> resultado = num1 - num2
                    "Multiplicação" -> resultado = num1 * num2
                    "Divisão" -> resultado = num1 / num2
                }
                tvResultado.text = resultado.toString()
            } else {
                tvResultado.text = "Entrada inválida."
            }

        }

    }
}