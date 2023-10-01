package com.example.monoglyceride.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.monoglyceride.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.morningBtn.setOnClickListener{
            binding.greetingText.text = getString(R.string.good_morning_text)
        }
        binding.afternoonBtn.setOnClickListener{
            binding.greetingText.text = getString(R.string.good_afternoon_text)
        }
        binding.eveningBtn.setOnClickListener{
            binding.greetingText.text = getString(R.string.good_evening_text)
        }

    }
}
