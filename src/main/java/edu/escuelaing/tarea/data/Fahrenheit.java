package edu.escuelaing.tarea.data;

public class Fahrenheit {

    private float number;
    private String type;
    private float  Celsius;

    public Fahrenheit(int number, String type) {
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

    public float getCelsius() {
        return Celsius;
    }

    public void setCelsius(float celsius) {
        Celsius = celsius;
    }
}
