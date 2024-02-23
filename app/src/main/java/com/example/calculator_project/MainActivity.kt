package com.example.calculator_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pantalla = findViewById<TextView>(R.id.pantalla)

        var btnUno = findViewById<Button>(R.id.uno)
        var btnDos = findViewById<Button>(R.id.dos)
        var btnTres = findViewById<Button>(R.id.tres)
        var btnCuatro = findViewById<Button>(R.id.cuatro)
        var btnCinco = findViewById<Button>(R.id.cinco)
        var btnSeis = findViewById<Button>(R.id.seis)
        var btnSiete = findViewById<Button>(R.id.siete)
        var btnOcho = findViewById<Button>(R.id.ocho)
        var btnNueve = findViewById<Button>(R.id.nueve)
        var btnCero = findViewById<Button>(R.id.cero)

        var btnMas = findViewById<Button>(R.id.mas)
        var btnIgual = findViewById<Button>(R.id.igual)
        var btnMultiplicacion = findViewById<Button>(R.id.multiplicacion)
        var btnResta = findViewById<Button>(R.id.resta)
        var btnDivision = findViewById<Button>(R.id.division)

        val btnClear = findViewById<Button>(R.id.btnClear)

        var operador1: Double = 0.0
        var operador2: Double = 0.0
        var operador: String = ""

        btnClear.setOnClickListener {
            pantalla.text = ""
        }

        btnUno.setOnClickListener {
            pantalla.append("1")
        }
        btnDos.setOnClickListener {
            pantalla.append("2")
        }
        btnTres.setOnClickListener {
            pantalla.append("3")
        }
        btnCuatro.setOnClickListener {
            pantalla.append("4")
        }
        btnCinco.setOnClickListener {
            pantalla.append("5")
        }
        btnSeis.setOnClickListener {
            pantalla.append("6")
        }
        btnSiete.setOnClickListener {
            pantalla.append("7")
        }
        btnOcho.setOnClickListener {
            pantalla.append("8")
        }
        btnNueve.setOnClickListener {
            pantalla.append("9")
        }
        btnCero.setOnClickListener {
            pantalla.append("0")
        }

        btnMas.setOnClickListener {
            if (pantalla.text.isNotEmpty()) { // Add this validation
                operador1 = pantalla.text.toString().toDouble()
                operador = "+"
                pantalla.text = ""
            }
        }

        btnIgual.setOnClickListener {
            if (pantalla.text.isNotEmpty()) { // Add this validation
                operador2 = pantalla.text.toString().toDouble()
                when (operador) {
                    "+" -> pantalla.text = (operador1 + operador2).toString()
                    "-" -> pantalla.text = (operador1 - operador2).toString()
                    "*" -> pantalla.text = (operador1 * operador2).toString()
                    "/" -> {
                        if (operador2 != 0.0) {
                            pantalla.text = (operador1 / operador2).toString()
                        } else {
                            pantalla.text = "Error"
                        }
                    }
                }
            }
        }

        btnMultiplicacion.setOnClickListener {
            if (pantalla.text.isNotEmpty()) { // Add this validation
                operador1 = pantalla.text.toString().toDouble()
                operador = "*"
                pantalla.text = ""
            }
        }

        btnResta.setOnClickListener {
            if (pantalla.text.isNotEmpty()) { // Add this validation
                operador1 = pantalla.text.toString().toDouble()
                operador = "-"
                pantalla.text = ""
            }
        }

        btnDivision.setOnClickListener {
            if (pantalla.text.isNotEmpty()) { // Add this validation
                operador1 = pantalla.text.toString().toDouble()
                operador = "/"
                pantalla.text = ""
            }
        }

    }
}
