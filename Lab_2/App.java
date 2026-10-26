package edu.neu.mgen;
public class App {
    public static void main(String[] args) {
        Animals[] zoo={
            new Bird(0.9,5.0,true,"Mountains",25,"Bald Eagle",2.0),
            new Bird(0.55,1.4,true,"Forests",13,"Great Horned Owl",1.4),
            new LandAnimal(1.2,190.0,true,"Savanna",14,"Lion",4),
            new LandAnimal(3.2,5000.0,false,"Savanna",60,"Elephant",4),
            new Fish(0.2,0.3,false,"Freshwater",10,"Goldfish",7),
            new Fish(4.0,520.0,true,"Ocean",30,"Great White Shark",8)
        };
        for (Animals a:zoo) {
            System.out.println(a);
            a.move();
            System.out.println();
        }
    }
}