package com.sifuentes.vania.laboratoriocalificado02

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sifuentes.vania.laboratoriocalificado02.databinding.ActivityEjercicio02Binding

class Ejercicio02 : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrar.setOnClickListener {
            val nombre = binding.etNombre.text.toString()
            val numero = binding.etNumero.text.toString()
            val producto = binding.etProducto.text.toString()
            val ciudad = binding.etCiudad.text.toString()
            val direccion = binding.etDireccion.text.toString()

            if (nombre.isBlank() || numero.isBlank() || producto.isBlank() || ciudad.isBlank() || direccion.isBlank()) {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, PedidoActivity::class.java)
                intent.putExtra("nombre", nombre)
                intent.putExtra("numero", numero)
                intent.putExtra("producto", producto)
                intent.putExtra("ubicacion", "$ciudad - $direccion")
                startActivity(intent)
            }
        }
    }
}
