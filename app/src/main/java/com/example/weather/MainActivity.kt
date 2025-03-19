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

        // Наблюдаем за изменениями в LiveData
        viewModel.summary.observe(this, Observer { summary ->
            binding.summaryTextView.text = summary
        })


        // Обновляем данные по нажатию кнопки
        binding.updateButton.setOnClickListener {
            viewModel.updateWeatherData()
        }
    }
}