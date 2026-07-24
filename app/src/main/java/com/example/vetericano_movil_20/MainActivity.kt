package com.example.vetericano_movil_20

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vetericano_movil_20.databinding.ActivityMainBinding
import com.example.vetericano_movil_20.databinding.ActivityRegisterAdminstradorBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdministrador.setOnClickListener {
            val intent = Intent(this, ActivityRegisterAdminstradorBinding::class.java)
            startActivity(intent)
        }

        binding.btnSuperAdmin.setOnClickListener {

        val intent= Intent(this, LoginSuperAdmin::class.java)
        startActivity(intent)

            Toast.makeText(this, "Super administrador", Toast.LENGTH_SHORT).show()

        }

binding.btnUsuario.setOnClickListener {
    val intent = Intent(this, RegisterUsuario::class.java)
    startActivity(intent)
}


        intent = Intent(this, LoginJuridico::class.java)
        startActivity(intent)



































































































































































        }
    }
