package edu.escuelaing.tarea.data;

import edu.escuelaing.tarea.service.CelsiusService;

public class Celsius  {

    private float number;
    private String type;
    private float  Fahrenheit;

    public Celsius(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getFahrenheit() {
        return Fahrenheit;
    }

    public void setFahrenheit(float fahrenheit) {
        Fahrenheit = fahrenheit;
    }
}
