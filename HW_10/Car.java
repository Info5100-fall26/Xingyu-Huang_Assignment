package edu.neu.mgen;
public class Car extends Vehicle {
    int seats;
    public Car(String brand,int maxSpeed,int seats) {
        super(brand,maxSpeed);
        this.seats=seats;
    }
    public void move() {
        System.out.println(brand+" car is driving on the road with "+seats+" seats");
    }
}
