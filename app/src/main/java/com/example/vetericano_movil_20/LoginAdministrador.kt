package com.example.vetericano_movil_20

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vetericano_movil_20.databinding.ActivityLoginAdministradorBinding
import com.example.vetericano_movil_20.databinding.ActivityMainBinding

class LoginAdministrador : AppCompatActivity() {

    private lateinit var binding: ActivityLoginAdministradorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityLoginAdministradorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrarseIngrese.setOnClickListener {
            val intent = Intent(this, RegisterAdminstrador::class.java)
            startActivity(intent)
            Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show()
        }

    }

}