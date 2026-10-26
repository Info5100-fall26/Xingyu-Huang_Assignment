package edu.neu.mgen;
public class Animals {
    protected double size;
    protected double weight;
    protected boolean predator;
    protected String habitat;
    protected int lifespan;
    public Animals(double size,double weight,boolean predator,String habitat,int lifespan) {
        this.size=size;
        this.weight=weight;
        this.predator=predator;
        this.habitat=habitat;
        this.lifespan=lifespan;
    }
    public void move() {
        System.out.println("The animal moves.");
    }
    @Override
    public String toString() {
        String diet;
        if (predator) {
            diet="Predator";
        } else {
            diet="Vegetarian";
        }
        return "size: "+size+", weight: "+weight
                +", diet: "+diet
                +", habitat: "+habitat+", lifespan: "+lifespan;
    }
}