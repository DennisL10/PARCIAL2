package com.dennis.parcial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.*



class MainActivity : AppCompatActivity() {
    private lateinit var tv_Mostrar: TextView
    private lateinit var lv_Lista: ListView

    private val Mascota = arrayOf("Oscar", "Elmer", "Kevin", "Cristian", "Milton")

    private val Especie = arrayOf("Perro", "Gato", "Tacuacin", "Rata", "leon")

    private val color = arrayOf("Gris", "Negro", "Blanco", "Cafe", "Gris, Blanco")

    private val sexo = arrayOf("Fenemenino", "Masculino", "Fenemenino", "Fenemenino", "Fenemenino")

    private val peso = arrayOf("15 Kg", "2 Kg", "3 Kg", "0.5 Kg", "200 Kg",)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_Mostrar = findViewById(R.id.tv_Mostrar)
        lv_Lista = findViewById(R.id.lv_View)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, Mascota)
        lv_Lista.adapter = adaptador

        lv_Lista.setOnItemClickListener { AdapterView, view, i, l ->
            tv_Mostrar.setText(
                "La informacion de " + lv_Lista.getItemAtPosition(i) + " es un : " + Especie[i] + " con color: " + color[i] + ", sexo: " +
                        sexo[i] + ", con un peso de: " + peso[i]
            )

        }
    }

}