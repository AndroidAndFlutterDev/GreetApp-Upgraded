package com.example.greetappupgraded

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.greetappupgraded.databinding.ActivityGreetingBinding

class GreetingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGreetingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGreetingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name") ?: "User"
        binding.tvGreet.text = "Hola, $name!"
    }
}