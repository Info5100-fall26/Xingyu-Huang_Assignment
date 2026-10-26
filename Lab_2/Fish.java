package edu.neu.mgen;
public class Fish extends Animals {
    private String speciesName;
    private int numberOfFins;
    public Fish(double size,double weight,boolean predator,String habitat,int lifespan,
                String speciesName,int numberOfFins) {
        super(size,weight,predator,habitat,lifespan);
        this.speciesName=speciesName;
        this.numberOfFins=numberOfFins;
    }
    @Override
    public void move() {
        System.out.println(speciesName+" swims using "+numberOfFins+" fins.");
    }
    @Override
    public String toString() {
        return "Fish: "+speciesName+", fins: "+numberOfFins+", "+super.toString();
    }
}