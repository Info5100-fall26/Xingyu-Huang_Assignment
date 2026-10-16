package edu.neu.mgen;
import java.util.ArrayList;
public class EngClass {
    ArrayList<Student> students=new ArrayList<Student>();
    public void addStudent(Student s) {
        students.add(s);
    }
    public void deleteStudent(int id) {
        for(int i=0;i<students.size();i++) {
            if(students.get(i).id==id) {
                students.remove(i);
                break;
            }
        }
    }
    public void printStudents() {
        for(int i=0;i<students.size();i++) {
            System.out.println(students.get(i));
        }
    }
}