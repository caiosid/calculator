package com.stackmobile.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNumber1: EditText
    private lateinit var editTextNumber2: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNumber1 = findViewById(R.id.editTextNumber1)
        editTextNumber2 = findViewById(R.id.editTextNumber2)
        button = findViewById(R.id.button)

        editTextNumber1 = findViewById(R.id.editTextNumber1)
        editTextNumber2 = findViewById(R.id.editTextNumber2)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val number1 = editTextNumber1.text.toString().toInt()
            val number2 = editTextNumber2.text.toString().toInt()
            val sum = number1 + number2

            val intent = Intent(this@MainActivity, ResultActivity::class.java)
            intent.putExtra("sum", sum)
            startActivity(intent)
        }
    }
}