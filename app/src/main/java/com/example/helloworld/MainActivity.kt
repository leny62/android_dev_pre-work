package com.example.helloworld

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.HelloButton)
        button.setOnClickListener {
          Toast.makeText(this, "Hello, How are you?", Toast.LENGTH_SHORT).show()
        }
    }
}