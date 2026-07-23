package com.example.vetericano_movil_20

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vetericano_movil_20.databinding.ActivityLoginSuperAdminBinding

class LoginSuperAdmin : AppCompatActivity() {
    private lateinit var binding: ActivityLoginSuperAdminBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginSuperAdminBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btnRegister.setOnClickListener {

            val intent= Intent(this, RegisterSuperAdmin::class.java)
            startActivity(intent)

            Toast.makeText(this, "Registro", Toast.LENGTH_SHORT).show()
        }
        binding.btnInicioSesion.setOnClickListener {
            Toast.makeText(this, "Inicio de sesion exitoso!", Toast.LENGTH_SHORT).show()


        }

    }
}