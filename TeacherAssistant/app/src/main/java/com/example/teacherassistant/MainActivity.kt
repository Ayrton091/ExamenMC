package com.example.teacherassistant

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ValorMC : EditText = findViewById(R.id.EditMC)

       /*
        var EditEF : EditText = findViewById(R.id.EditEF)
        var ValorEF: Int = EditEF.text.toString().toInt()

        var EditP : EditText = findViewById(R.id.EditP)
        var ValorP: Int = EditP.text.toString().toInt()*/


        val btnAdd= findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener {
            val lanzar = Intent(this,MainActivity2::class.java)
            Toast.makeText( this,"ValorMC", Toast.LENGTH_SHORT).show()
            startActivity(lanzar)
        }
    }

}
