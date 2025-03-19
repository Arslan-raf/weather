package com.example.weather

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.weather.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: WeatherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.temperature.observe(this, Observer { temperature ->
            binding.summaryTextView.text = temperature.toString()
        })

        viewModel.humidity.observe(this, Observer { humidity ->
            binding.statisticsTextView.text = humidity.toString()
        })

        viewModel.pressure.observe(this, Observer { pressure ->
            binding.forecastTextView.text = pressure.toString()
        })

        binding.updateButton.setOnClickListener {
            viewModel.updateWeatherData()
        }
    }
}