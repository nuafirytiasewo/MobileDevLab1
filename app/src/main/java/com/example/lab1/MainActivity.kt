package com.example.lab1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNumber1: EditText
    private lateinit var editTextNumber2: EditText
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNumber1 = findViewById(R.id.editTextNumber1)
        editTextNumber2 = findViewById(R.id.editTextNumber2)
        textViewResult = findViewById(R.id.textViewResult)

        //сложение
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        buttonAdd.setOnClickListener {
            val number1 = editTextNumber1.text.toString().toDoubleOrNull()
            val number2 = editTextNumber2.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null) {
                val result = number1 + number2
                textViewResult.text = String.format(getString(R.string.result_text), result)
            } else {
                Toast.makeText(this, "Ошибка ввода! (Введите корректные данные)", Toast.LENGTH_SHORT).show()
            }
        }

        //вычитание
        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        buttonSubtract.setOnClickListener {
            val number1 = editTextNumber1.text.toString().toDoubleOrNull()
            val number2 = editTextNumber2.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null) {
                val result = number1 - number2
                textViewResult.text = String.format(getString(R.string.result_text), result)
            } else {
                Toast.makeText(this, "Ошибка ввода! (Введите корректные данные)", Toast.LENGTH_SHORT).show()
            }
        }

        //умножение
        val buttonMultiply = findViewById<Button>(R.id.buttonMultiply)
        buttonMultiply.setOnClickListener {
            val number1 = editTextNumber1.text.toString().toDoubleOrNull()
            val number2 = editTextNumber2.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null) {
                val result = number1 * number2
                textViewResult.text = String.format(getString(R.string.result_text), result)
            } else {
                Toast.makeText(this, "Ошибка ввода! (Введите корректные данные)", Toast.LENGTH_SHORT).show()
            }
        }

        //деление
        val buttonDivide = findViewById<Button>(R.id.buttonDivide)
        buttonDivide.setOnClickListener {
            val number1 = editTextNumber1.text.toString().toDoubleOrNull()
            val number2 = editTextNumber2.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null && number2 != 0.0) {
                val result = number1 / number2
                textViewResult.text = String.format(getString(R.string.result_text), result)
            } else {
                Toast.makeText(this, "Ошибка ввода или ошибка деления на 0!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}