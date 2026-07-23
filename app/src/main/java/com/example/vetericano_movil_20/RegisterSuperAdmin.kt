package com.example.vetericano_movil_20

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vetericano_movil_20.databinding.ActivityRegisterSuperAdminBinding

class RegisterSuperAdmin : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterSuperAdminBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegisterSuperAdminBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
          val intent= Intent(this, LoginSuperAdmin::class.java)
          startActivity(intent)
        }

        binding.btnRegistrar.setOnClickListener {

            Toast.makeText(this, "Registrado Existosamente", Toast.LENGTH_SHORT).show()


        }

    }
}