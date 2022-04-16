package com.example.teacherassistant

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnCrear= findViewById<Button>(R.id.btnCrear)
        btnCrear.setOnClickListener {
            val Crear = Intent(this,MainActivity3::class.java)
            startActivity(Crear)
        }
    }
}