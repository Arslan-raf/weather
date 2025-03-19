package com.example.weather;
import java.util.random.RandomGenerator;

public class WeatherSheetData0 {
    /** Возвращают новые показатели **/
    public float getTemperature() {
        return RandomGenerator.getDefault().nextFloat(0, 30);
    }
    public float getHumidity(){
        return RandomGenerator.getDefault().nextFloat(10, 100);
    }
    public float getPressure(){
        return RandomGenerator.getDefault().nextFloat(740, 760);
    }

    /** Вызывается при каждом обновлении показателей датчиков (как он вызывается - не важно) **/
    public void measurementChanged() {
    }


}
