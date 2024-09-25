package com.pf.primeiroprojeto

import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BuscarCervejaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buscar_cerveja)
        val spinnerCerveja: Spinner = findViewById(R.id.spinnerCerveja)
        val botaoBuscar: Button = findViewById(R.id.botaoBuscar)
        val marcasCerveja: TextView = findViewById(R.id.marcasCerveja)

        val expertCerveja = ExpertCerveja()

        botaoBuscar.setOnClickListener {
            val tipoSelecionado = spinnerCerveja.selectedItem.toString()
            val marcas = expertCerveja.getMarcas(tipoSelecionado)
            marcasCerveja.text = marcas.joinToString(", ")
        }
    }
}