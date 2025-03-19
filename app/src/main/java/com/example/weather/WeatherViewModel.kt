package com.example.weather

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weather.WeatherSheetData0

class WeatherViewModel : ViewModel() {

    private val weatherSheet = WeatherSheetData0()

    private val _temperature = MutableLiveData<Float>()
    val temperature: LiveData<Float> get() = _temperature

    private val _humidity = MutableLiveData<Float>()
    val humidity: LiveData<Float> get() = _humidity

    private val _pressure= MutableLiveData<Float>()
    val pressure: LiveData<Float> get() = _pressure

    fun updateWeatherData() {
        val newTemperature = weatherSheet.getTemperature()
        val newHumidity = weatherSheet.getHumidity()
        val newPressure = weatherSheet.getPressure()

        _temperature.value = newTemperature
        _humidity.value = newHumidity
        _pressure.value = newPressure
    }
}
