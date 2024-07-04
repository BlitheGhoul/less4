package service;

import model.Student;

public class StudentService {
    public Student createStudent(String name, String lastName, int id){
        return new Student(id, name, lastName);
    }
}
