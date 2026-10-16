package edu.neu.mgen;
public class Main {
    public static void main(String[] args) {
        Vehicle[] list=new Vehicle[4];
        list[0]=new Car("Toyota",180,5);
        list[1]=new Motorbike("Honda",160,600);
        list[2]=new Aircraft("Boeing",900,12000);
        list[3]=new Ship("Yamaha",80,5000);
        for(int i=0;i<list.length;i++) {
            list[i].info();
            list[i].move();
        }
    }
}