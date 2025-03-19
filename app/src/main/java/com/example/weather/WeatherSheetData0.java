package com.example.weather;
//import java.util.random.RandomGenerator;
import java.util.Random;

public class WeatherSheetData0 {
    private final Random random = new Random();
    /** Возвращают новые показатели **/
    public float getTemperature() {
        return random.nextFloat() * 30;
    }
    public float getHumidity(){
        return 10 + random.nextFloat() * 90;
    }
    public float getPressure(){
        return 740 + random.nextFloat() * 20;
    }

    /** Вызывается при каждом обновлении показателей датчиков (как он вызывается - не важно) **/
    public void measurementChanged() {
    }


}
