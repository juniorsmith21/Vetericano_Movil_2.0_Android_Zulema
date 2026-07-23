package com.example.vetericano_movil_20

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vetericano_movil_20.databinding.ActivityMainBinding
import com.example.vetericano_movil_20.databinding.ActivityRegisterUsuarioBinding

class RegisterUsuario : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterUsuarioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistro.setOnClickListener {


        }

            binding.btnRegresar.setOnClickListener {
                val intent= Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

    }
}
