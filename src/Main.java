import controller.StudentController;
import controller.UserController;
import model.Student;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       new StudentController().sendOnConsole(getStudents());

    }

    private static List<Student> getStudents(){
        Student s1 = new Student(1, "Sasha", "Ivanov");
        Student s2 = new Student(2, "Masha", "Ivanova");
        return List.of(s1, s2);
    }
}