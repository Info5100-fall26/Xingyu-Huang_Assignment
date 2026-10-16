package edu.neu.mgen;
public class Student {
    int id;
    String firstName;
    String lastName;
    public Student(int id,String firstName,String lastName) {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String toString() {
        return id+" "+firstName+" "+lastName;
    }
}