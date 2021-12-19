package util;

import beans.Student;
import config.Config;

public class StudentUtil {

    public static Student fillStudent() {
        String name = InputUtil.requireText("Enter name");
        String surname = InputUtil.requireText("Enter surname");
        String className = InputUtil.requireText("Enter class Name");
        int age = InputUtil.requireNumber("Enter age");
        Student student = new Student(name, surname, age, className);
        return student;
    }

    public static void printAllRegisteredStudent() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student s = Config.students[i];
            System.out.println(s.getName() + " " + s.getSurname() + " -- " + s.getClassName() + " -- " + s.getAge());
        }
    }
    public  static void registerStudents(){
        int count = InputUtil.requireNumber("How many student do you want to add?");
        Config.students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + " Register!");
            Config.students[i] = StudentUtil.fillStudent();
        }
        System.out.println("Students registration successfully completed!");
        StudentUtil.printAllRegisteredStudent();
    }
}
