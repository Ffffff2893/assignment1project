package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Student extends Person {
    private int studentID;
    private List<Integer> grades;

    public Student(String name, String surname, int age, boolean isMale) {
        super(name, surname, age, isMale);
        this.studentID = new Random().nextInt(9000) + 1000;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / (double) grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}