package com.example.greetappupgraded

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.greetappupgraded.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        const val MAX_LENGTH_NAME = 10
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGreet.setOnClickListener {
            val name = binding.etName.text.toString().trim()

            if (name.length > MAX_LENGTH_NAME) {
                Toast.makeText(this, getString(R.string.error), Toast.LENGTH_SHORT).show()
            } else {
                navigateToGreetingActivity(name)
            }
        }
    }

    private fun navigateToGreetingActivity(name: String) {
        val intent = Intent(this, GreetingActivity::class.java)
        intent.putExtra("name", name)
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
    }
}