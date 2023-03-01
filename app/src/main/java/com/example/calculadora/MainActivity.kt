package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Sumar(view: View) {

        val Num1 = findViewById<EditText>(R.id.Numero1)
        val Num2 = findViewById<EditText>(R.id.Numero2)
        val Resultado:TextView = findViewById<EditText>(R.id.Resultado)

        var bndNum1 = true
        var bndNum2 = true

        Num1.error = null
        Num2.error = null

        if (Num1.text.toString().trim().isEmpty()) {
            bndNum1 = false
            Num1.error = getString(R.string.activity_main_error)
        }
        if (Num2.text.toString().trim().isEmpty()) {
            bndNum2 = false
            Num2.error = getString(R.string.activity_main_error)
        }

        if (bndNum1 && bndNum2) {

            var operacion = Num1.text.toString().toFloat() + Num2.text.toString().toFloat()
            Resultado.text = operacion.toString()

        }

    }
    fun Multiplicar(view: View) {

        val Num1 = findViewById<EditText>(R.id.Numero1)
        val Num2 = findViewById<EditText>(R.id.Numero2)
        val Resultado:TextView = findViewById<EditText>(R.id.Resultado)

        var bndNum1 = true
        var bndNum2 = true

        Num1.error = null
        Num2.error = null

        if (Num1.text.toString().trim().isEmpty()) {
            bndNum1 = false
            Num1.error = getString(R.string.activity_main_error)
        }
        if (Num2.text.toString().trim().isEmpty()) {
            bndNum2 = false
            Num2.error = getString(R.string.activity_main_error)
        }

        if (bndNum1 && bndNum2) {

            var operacion = Num1.text.toString().toFloat() * Num2.text.toString().toFloat()
            Resultado.text = operacion.toString()

        }

    }
    fun Restar(view: View) {

        val Num1 = findViewById<EditText>(R.id.Numero1)
        val Num2 = findViewById<EditText>(R.id.Numero2)
        val Resultado:TextView = findViewById<EditText>(R.id.Resultado)

        var bndNum1 = true
        var bndNum2 = true

        Num1.error = null
        Num2.error = null

        if (Num1.text.toString().trim().isEmpty()) {
            bndNum1 = false
            Num1.error = getString(R.string.activity_main_error)
        }
        if (Num2.text.toString().trim().isEmpty()) {
            bndNum2 = false
            Num2.error = getString(R.string.activity_main_error)
        }

        if (bndNum1 && bndNum2) {

            var operacion = Num1.text.toString().toFloat() - Num2.text.toString().toFloat()
            Resultado.text = operacion.toString()

        }

    }
    fun Dividir(view: View) {

        val Num1 = findViewById<EditText>(R.id.Numero1)
        val Num2 = findViewById<EditText>(R.id.Numero2)
        val Resultado:TextView = findViewById<EditText>(R.id.Resultado)

        var bndNum1 = true
        var bndNum2 = true

        Num1.error = null
        Num2.error = null

        if (Num1.text.toString().trim().isEmpty()) {
            bndNum1 = false
            Num1.error = getString(R.string.activity_main_error)
        }
        if (Num2.text.toString().trim().isEmpty()) {
            bndNum2 = false
            Num2.error = getString(R.string.activity_main_error)
        }

        if (bndNum1 && bndNum2) {

            var operacion = Num1.text.toString().toFloat() / Num2.text.toString().toFloat()
            Resultado.text = operacion.toString()

        }

    }

}