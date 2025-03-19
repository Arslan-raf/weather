package com.example.weather

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weather.WeatherSheetData0

class WeatherViewModel : ViewModel() {

    private val weatherSheet = WeatherSheetData0()

    private val _temperature = MutableLiveData<Float>()
    val temperature: LiveData<Float> get() = _temperature



    fun updateWeatherData() {
        // Получаем новые данные
        val newTemperature = weatherSheet.getTemperature()
        val newHumidity = weatherSheet.getHumidity()
        val newPressure = weatherSheet.getPressure()

    }
}
