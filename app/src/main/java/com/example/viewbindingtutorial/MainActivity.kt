package com.example.viewbindingtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindingtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitButton.setOnClickListener {
            binding.showText.text = binding.enterTextField.text
        }
    }
}