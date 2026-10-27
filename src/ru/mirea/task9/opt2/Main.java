package ru.mirea.task9.opt2;

import java.util.Arrays;
import ru.mirea.task9.opt1.Sorting;
import ru.mirea.task9.opt1.Student;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1042, "Иванов", 4.3),
                new Student(1007, "Петров", 3.8),
                new Student(1103, "Сидоров", 4.9),
                new Student(1025, "Кузнецов", 4.1),
                new Student(1001, "Смирнов", 3.5)
        };
        Sorting.quickSort(students, new SortingStudentsByGPA());

        System.out.println("По убыванию среднего балла (быстрая сортировка):");
        Arrays.stream(students).forEach(System.out::println);
    }
}
