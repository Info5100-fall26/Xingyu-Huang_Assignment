package edu.neu.mgen;
public class App {
    public static void main(String[] args) {
        EngClass eng=new EngClass();
        eng.addStudent(new Student(101,"Anne","Smith"));
        eng.addStudent(new Student(102,"John","Doe"));
        eng.addStudent(new Student(103,"Alex","Brown"));
        System.out.println("All students:");
        eng.printStudents();
        eng.deleteStudent(102);
        System.out.println("After delete:");
        eng.printStudents();
    }
}