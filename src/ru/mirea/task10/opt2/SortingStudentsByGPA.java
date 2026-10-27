package ru.mirea.task10.opt2;

import java.util.Comparator;

public class SortingStudentsByGPA {
    private Student[] iDNumber;

    static class GpaDescendingComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return Double.compare(b.getGpa(), a.getGpa());
        }
    }

    public void setArray() {
        iDNumber = new Student[]{
                new Student("Иван", "Иванов", "Информатика", 2, "ИКБО-01-24", 4.3),
                new Student("Пётр", "Петров", "Информатика", 2, "ИКБО-01-24", 3.8),
                new Student("Анна", "Сидорова", "Прикладная математика", 2, "ИВБО-02-24", 4.9),
                new Student("Олег", "Кузнецов", "Информатика", 2, "ИКБО-03-24", 4.1),
                new Student("Мария", "Смирнова", "Прикладная математика", 2, "ИВБО-02-24", 3.5)
        };
    }

    public void quicksort() {
        quicksort(iDNumber, 0, iDNumber.length - 1, new GpaDescendingComparator());
    }

    private void quicksort(Student[] a, int low, int high, Comparator<Student> comparator) {
        if (low >= high) {
            return;
        }
        Student pivot = a[low + (high - low) / 2];
        int i = low;
        int j = high;
        while (i <= j) {
            while (comparator.compare(a[i], pivot) < 0) {
                i++;
            }
            while (comparator.compare(a[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;
            }
        }
        quicksort(a, low, j, comparator);
        quicksort(a, i, high, comparator);
    }

    public void mergeSort() {
        iDNumber = mergeSort(iDNumber, new GpaDescendingComparator());
    }

    public void sortBy(Comparator<Student> comparator) {
        iDNumber = mergeSort(iDNumber, comparator);
    }

    private Student[] mergeSort(Student[] a, Comparator<Student> comparator) {
        if (a.length < 2) {
            return a;
        }
        int middle = a.length / 2;
        Student[] left = mergeSort(java.util.Arrays.copyOfRange(a, 0, middle), comparator);
        Student[] right = mergeSort(java.util.Arrays.copyOfRange(a, middle, a.length), comparator);
        Student[] result = new Student[a.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            result[k++] = comparator.compare(left[i], right[j]) <= 0 ? left[i++] : right[j++];
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        sorter.setArray();
        System.out.println("Исходный массив:");
        sorter.outArray();

        sorter.quicksort();
        System.out.println("Быстрая сортировка по убыванию среднего балла:");
        sorter.outArray();

        sorter.setArray();
        sorter.mergeSort();
        System.out.println("Сортировка слиянием по убыванию среднего балла:");
        sorter.outArray();

        sorter.sortBy(Comparator.comparing(Student::getSurname));
        System.out.println("По фамилии (по алфавиту):");
        sorter.outArray();

        sorter.sortBy(Comparator.comparing(Student::getGroup).thenComparing(Student::getSurname));
        System.out.println("По группе, затем по фамилии:");
        sorter.outArray();
    }
}
