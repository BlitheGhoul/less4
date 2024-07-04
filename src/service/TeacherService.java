package service;

import model.Teacher;

import java.util.Scanner;

public class TeacherService {
    public Teacher createTeacher(String name, String lastName, int id){
        return new Teacher(id, name, lastName);
    }

    public void correctTeacherName(Teacher teacher){
        System.out.println("Введите новое имя: ");
        Scanner scan = new Scanner(System.in);
        teacher.setName(scan.nextLine());
    }
    public void correctTeacherLastName(Teacher teacher){
        System.out.println("Введите новую фамилию: ");
        Scanner scan = new Scanner(System.in);
        teacher.setLastName(scan.nextLine());
    }


}
