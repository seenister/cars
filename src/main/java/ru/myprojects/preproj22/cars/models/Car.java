package ru.myprojects.preproj22.cars.models;



public class Car {

    private String model;
    private int series;
    private float weight;

    public Car(String model, int series, float weight) {
        this.model = model;
        this.series = series;
        this.weight = weight;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
