package controller;

import model.Student;
import model.Teacher;
import model.User;
import service.TeacherService;
import view.StudentView;
import view.TeacherView;
import view.UserView;

import java.util.List;

public class TeacherController implements UserController {
    private UserView<Teacher> view = new TeacherView();
    private TeacherService service = new TeacherService();

    @Override
    public <T extends User> User create(T user) {
        return (User) user;
    }

    public void sendOnConsole(List<Teacher> teachers) {
        view.sendOnConsole(teachers);
    }

    public void createTeacher (String name, String lastName, int id){
        service.createTeacher(name, lastName, id);
    }

    public void correctTeacherName(Teacher teacher){
        service.correctTeacherName(teacher);
    }
    public void correctTeacherLastName(Teacher teacher){
        service.correctTeacherLastName(teacher);
    }
}