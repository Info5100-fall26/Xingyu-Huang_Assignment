package edu.neu.mgen;
public class Motorbike extends Vehicle {
    int engineCC;
    public Motorbike(String brand,int maxSpeed,int engineCC) {
        super(brand,maxSpeed);
        this.engineCC=engineCC;
    }
    public void move() {
        System.out.println(brand+" motorbike is riding on the road, engine "+engineCC+"cc");
    }
}