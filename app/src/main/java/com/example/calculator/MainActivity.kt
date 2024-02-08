package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /////////////////////////////////////////
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.B1)
        var pantalla = findViewById<TextView>(R.id.Pantalla)

        btn.setOnClickListener{
            pantalla.text = pantalla.text.toString()+"1"
        }
    }
}