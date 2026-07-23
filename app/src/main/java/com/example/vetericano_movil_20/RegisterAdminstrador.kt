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

class RegisterAdminstrador : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterAdminstradorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterAdminstradorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrar.setOnClickListener {
            val intent = Intent(this, RegisterAdminstrador::class.java)
            startActivity(intent)
            Toast.makeText(this, "cuenta registrada", Toast.LENGTH_SHORT).show()
        }
        binding.b
    }
}