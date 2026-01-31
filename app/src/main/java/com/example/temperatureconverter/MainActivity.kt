package com.example.temperatureconverter

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val Entervalue: TextView = findViewById(R.id.Entervalue)
        val Celsius: RadioButton = findViewById(R.id.Celsius)
        val Fahrenheit: RadioButton = findViewById(R.id.Fahrenheit)
        val Kelvin: RadioButton = findViewById(R.id.Kelvin)
        val Calculate: Button = findViewById(R.id.Calculate)
        val Cvalue: TextView = findViewById(R.id.Cvalue)
        val Fvalue: TextView = findViewById(R.id.Fvalue)
        val Kvalue: TextView = findViewById(R.id.Kvalue)
        val clear: TextView = findViewById(R.id.clear)

        Calculate.setOnClickListener {

            val input = Entervalue.text.toString().toDouble()

            if (Celsius.isChecked) {
                val c = input
                val f = (c * 9 / 5) + 32
                val k = c + 273.15

                Cvalue.text = String.format("Celsius : %.2f °C",c)
                Fvalue.text = String.format("Fahrenheit : %.2f °F",f)
                Kvalue.text = String.format("Kelvin : %.2f K",k)

            }
            else if (Fahrenheit.isChecked) {
                val f = input
                val c = (f - 32) * 5 / 9
                val k = c + 273.15

                Cvalue.text = String.format("Celsius : %.2f °C",c)
                Fvalue.text = String.format("Fahrenheit : %.2f °F",f)
                Kvalue.text = String.format("Kelvin : %.2f K",k)

            }
            else if (Kelvin.isChecked) {
                val k = input
                val c = k - 273.15
                val f = (c * 9 / 5) + 32

                Cvalue.text = String.format("Celsius : %.2f °C",c)
                Fvalue.text = String.format("Fahrenheit : %.2f °F",f)
                Kvalue.text = String.format("Kelvin : %.2f K",k)


            }
        }
        clear.setOnClickListener {

            Cvalue.text = String.format("")
            Fvalue.text = String.format("")
            Kvalue.text = String.format("")
        }
    }
}