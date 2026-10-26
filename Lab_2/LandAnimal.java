package edu.neu.mgen;
public class LandAnimal extends Animals {
    private String speciesName;
    private int numberOfLegs;
    public LandAnimal(double size,double weight,boolean predator,String habitat,int lifespan,
                      String speciesName,int numberOfLegs) {
        super(size,weight,predator,habitat,lifespan);
        this.speciesName=speciesName;
        this.numberOfLegs=numberOfLegs;
    }
    @Override
    public void move() {
        System.out.println(speciesName+" walks on "+numberOfLegs+" legs.");
    }
    @Override
    public String toString() {
        return "LandAnimal: "+speciesName+", legs: "+numberOfLegs+", "+super.toString();
    }
}