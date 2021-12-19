package main;

import beans.Student;
import config.Config;
import util.InputUtil;
import util.StudentUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu = InputUtil.requireNumber("What do you want ?\n" +
                "1.Register Student\n" +
                "2.Show all Student \n" +
                "3.Find Student\n" +
                "4.Update Student");
        if (menu == 1) {
            StudentUtil.registerStudents();
            System.out.println("----------------------------------------------------------------------------------------");
        } else if (menu == 2) {
            StudentUtil.printAllRegisteredStudent();
            System.out.println("----------------------------------------------------------------------------------------");
        } else if (menu == 3) {
            String text = InputUtil.requireText("Search name ,surname or class name :");
            for (int i = 0; i < Config.students.length; i++) {
                Student s = Config.students[i];
                if (s.getName().contains(text) || s.getSurname().contains(text) || s.getClassName().contains(text)){
                    System.out.println(s.getName() + " " + s.getSurname() + " -- " + s.getClassName() + " -- " + s.getAge());
                }
            }
            System.out.println("----------------------------------------------------------------------------------------");
        }
        main(args);

    }
}
