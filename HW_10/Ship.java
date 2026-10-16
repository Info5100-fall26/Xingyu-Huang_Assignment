package edu.neu.mgen;
public class Ship extends Vehicle {
    int tonnage;
    public Ship(String brand,int maxSpeed,int tonnage) {
        super(brand,maxSpeed);
        this.tonnage=tonnage;
    }
    public void move() {
        System.out.println(brand+" ship is sailing, tonnage "+tonnage);
    }
}