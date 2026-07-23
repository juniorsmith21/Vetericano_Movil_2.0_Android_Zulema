package com.example.vetericano_movil_206

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vetericano_movil_20.databinding.ActivityLoginJuridicoBinding
import com.example.vetericano_movil_20.databinding.ActivityRegisterJuridicoBinding

class RegisterJuridico : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterJuridicoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterJuridicoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegis.setOnClickListener {

            if (binding.NombreEmpresa.text.toString().trim().isEmpty() ||

                binding.Nit.text.toString().trim().isEmpty() ||

                binding.Correo.text.toString().trim().isEmpty() ||

                binding.Telefono.text.toString().trim().isEmpty() ||

                binding.Password.text.toString().trim().isEmpty()

            ) {

                Toast.makeText(this, "Complete todos los campos", Toast.LENGTH_SHORT).show()

            } else {

                Toast.makeText(this, "Jurídico registrado", Toast.LENGTH_SHORT).show()
            }
        }
    }
}