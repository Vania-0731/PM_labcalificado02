package com.sifuentes.vania.laboratoriocalificado02

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sifuentes.vania.laboratoriocalificado02.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val nombre = intent.getStringExtra("nombre")
        val numero = intent.getStringExtra("numero")
        val producto = intent.getStringExtra("producto")
        val ubicacion = intent.getStringExtra("ubicacion")
        binding.tvNombreCliente.text = nombre
        binding.tvNumeroCliente.text = numero
        binding.tvProducto.text = producto
        binding.tvUbicacion.text = ubicacion
        binding.btnLlamar.setOnClickListener {
            Toast.makeText(this, "Llamando a $nombre ($numero)", Toast.LENGTH_SHORT).show()
        }
        binding.btnWsp.setOnClickListener {
            Toast.makeText(
                this,
                "Hola $nombre. Tus productos: $producto están en camino a la dirección: $ubicacion",
                Toast.LENGTH_LONG
            ).show()
        }
        binding.btnMaps.setOnClickListener {
            Toast.makeText(this, "Ubicación: $ubicacion", Toast.LENGTH_SHORT).show()
        }
    }
}
