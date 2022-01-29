package edu.escuelaing.tarea.service;

import edu.escuelaing.tarea.data.Celsius;
import edu.escuelaing.tarea.data.Fahrenheit;
import org.springframework.stereotype.Service;

@Service
public class CelsiusServicePass implements CelsiusService, FahrenheitService{


    @Override
    public Celsius passToFahrenheit(Celsius celsius) {
        celsius.setFahrenheit((float) ((celsius.getNumber() * (float) 9/5)+32));
        return celsius;
    }


    @Override
    public Fahrenheit passToCelsius(Fahrenheit fahrenheit) {
        fahrenheit.setCelsius((float) ((fahrenheit.getNumber()-32) * (float) 5/9));
        return fahrenheit;
    }
}
