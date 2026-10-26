package edu.neu.mgen;
public class Bird extends Animals {
    private String speciesName;
    private double wingspan;
    public Bird(double size,double weight,boolean predator,String habitat,int lifespan,
                String speciesName,double wingspan) {
        super(size,weight,predator,habitat,lifespan);
        this.speciesName=speciesName;
        this.wingspan=wingspan;
    }
    @Override
    public void move() {
        System.out.println(speciesName+" flies in the sky.");
    }
    @Override
    public String toString() {
        return "Bird: "+speciesName+", wingspan: "+wingspan+", "+super.toString();
    }
}