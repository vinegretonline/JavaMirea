package ru.mirea.task9.opt1;

public class Student implements Comparable<Student> {
    private final int iDNumber;
    private final String name;
    private final double gpa;

    public Student(int iDNumber, String name, double gpa) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return String.format("Student{id=%d, name=%s, gpa=%.2f}", iDNumber, name, gpa);
    }
}
