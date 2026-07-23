package com.example.vetericano_movil_20

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.vetericano_movil_20.databinding.ActivityLoginJuridicoBinding

class LoginJuridico : AppCompatActivity() {

    private lateinit var binding: ActivityLoginJuridicoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginJuridicoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.sesion.setOnClickListener {

            val correo = binding.correo.text.toString().trim()
            val contra = binding.contra.text.toString().trim()

            if (correo.isEmpty() || contra.isEmpty()) {
                Toast.makeText(this, "Complete todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Usuario logeado", Toast.LENGTH_SHORT).show()
            }

        }
        binding.loginn.setOnClickListener {
            val intent = Intent(this, RegisterJuridico::class.java)
            startActivity(intent)
        }
    }
}