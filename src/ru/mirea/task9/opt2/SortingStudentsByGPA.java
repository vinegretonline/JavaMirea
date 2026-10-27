package ru.mirea.task9.opt2;

import java.util.Comparator;
import ru.mirea.task9.opt1.Student;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getGpa(), a.getGpa());
    }
}
