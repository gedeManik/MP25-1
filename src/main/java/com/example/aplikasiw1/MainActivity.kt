package com.example.helloworld

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editTextName = findViewById<EditText>(R.id.editTextName)
        val buttonSayHello = findViewById<Button>(R.id.buttonSayHello)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)


        buttonSayHello.setOnClickListener {
            val name = editTextName.text.toString().trim()

            if (name.isNotEmpty()) {
                textViewResult.text = "Hello, $name"
                textViewResult.visibility = View.VISIBLE
            } else {
                textViewResult.text = "Please enter your name!"
                textViewResult.visibility = View.VISIBLE
            }
        }
    }
}