package com.example.teacherassistant

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.teacherassistant.databinding.ActivityMainBinding
import java.io.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrarCurso.setOnClickListener {
            Guardar(binding.EditNombreCurso.text.toString())
            binding.NombreCurso.text=Cargar()
        }

        val btnAdd= findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener {
            val lanzar = Intent(this,MainActivity2::class.java)
            startActivity(lanzar)
        }






    }

    private fun Cargar(): String {
        var texto=" "
        try {
            val rutaSD = baseContext.getExternalFilesDir(null)?.absolutePath
            val miCarpeta = File(rutaSD, "Datos")
            val ficheroFisico=File(miCarpeta,"Datos.txt")
            val fichero = BufferedReader(InputStreamReader(FileInputStream(ficheroFisico)))
            val texto = fichero.use(BufferedReader::readText)
        }
        catch (e:Exception){
            //nada
        }
        return texto

    }

    private fun Guardar(texto: String) {
        try {
            val rutaSD = baseContext.getExternalFilesDir(null)?.absolutePath
            val miCarpeta = File(rutaSD, "Datos")
            if (!miCarpeta.exists()) {
                miCarpeta.mkdir()
            }
            val ficheroFisico = File(miCarpeta, "Datos.txt")
            ficheroFisico.appendText("$texto\n")
        }
        catch (e:Exception){
            Toast.makeText(this,"no se ha podido guardar",Toast.LENGTH_LONG).show()
        }

    }


    }






