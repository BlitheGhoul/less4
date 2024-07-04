package model;

import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {
    public StringBuilder students = new StringBuilder();

    public void addStudent(Student student){
        students.append(student).append(" ");
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudenrGroupIterator(this);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }
}