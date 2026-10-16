package edu.neu.mgen;
public abstract class Vehicle {
    String brand;
    int maxSpeed;
    public Vehicle(String brand,int maxSpeed) {
        this.brand=brand;
        this.maxSpeed=maxSpeed;
    }
    public abstract void move();
    public void info() {
        System.out.println(brand+", max speed "+maxSpeed+" km/h");
    }
}