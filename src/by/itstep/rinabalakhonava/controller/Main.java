package by.itstep.rinabalakhonava.controller;

import by.itstep.rinabalakhonava.model.StudentManager;
import by.itstep.rinabalakhonava.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input count of students");
        int count = scanner.nextInt();

        int[] marks = new int[count];

        Student[] students = new Student[10];

        System.out.print("Input student's marks: ");
        int mark1 = scanner.nextInt();
        int mark2 = scanner.nextInt();
        int mark3 = scanner.nextInt();
        int mark4 = scanner.nextInt();
        int mark5 = scanner.nextInt();

        double avg = StudentManager.calAvgStudentMark(mark1, mark2, mark3, mark4, mark5);

        String msg = String.format("Student's average mark is %f", avg);

        Printer.print(msg);

    }
}
