package com.stackmobile.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        textViewResult = findViewById(R.id.textViewResult)

        val intent = intent
        val sum = intent.getIntExtra("sum", 0)
        textViewResult.text = sum.toString()
    }
}