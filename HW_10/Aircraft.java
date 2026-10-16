package edu.neu.mgen;
public class Aircraft extends Vehicle {
    int maxAltitude;
    public Aircraft(String brand,int maxSpeed,int maxAltitude) {
        super(brand,maxSpeed);
        this.maxAltitude=maxAltitude;
    }
    public void move() {
        System.out.println(brand+" aircraft is flying at "+maxAltitude+" meters");
    }
}
