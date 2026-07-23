package com.example.vetericano_movil_20

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vetericano_movil_20.databinding.ActivityLoginUsuarioBinding
import com.example.vetericano_movil_20.databinding.ActivityMainBinding

class LoginUsuario : AppCompatActivity() {

    private lateinit var binding: ActivityLoginUsuarioBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVolver.setOnClickListener {
            val intent= Intent(this, RegisterUsuario::class.java)
            startActivity(intent)
        }

        binding.btnRegistroo.setOnClickListener {

        }

    }
}