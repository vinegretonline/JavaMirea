package ru.mirea.task9.opt1;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {

    public static <T extends Comparable<? super T>> void insertionSort(T[] list) {
        for (int i = 1; i < list.length; i++) {
            T key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].compareTo(key) > 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }

    public static <T> void quickSort(T[] list, Comparator<? super T> comparator) {
        quickSort(list, 0, list.length - 1, comparator);
    }

    private static <T> void quickSort(T[] list, int low, int high, Comparator<? super T> comparator) {
        if (low >= high) {
            return;
        }
        T pivot = list[low + (high - low) / 2];
        int i = low;
        int j = high;
        while (i <= j) {
            while (comparator.compare(list[i], pivot) < 0) {
                i++;
            }
            while (comparator.compare(list[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                T tmp = list[i];
                list[i] = list[j];
                list[j] = tmp;
                i++;
                j--;
            }
        }
        quickSort(list, low, j, comparator);
        quickSort(list, i, high, comparator);
    }

    public static <T> void mergeSort(T[] list, Comparator<? super T> comparator) {
        if (list.length < 2) {
            return;
        }
        int middle = list.length / 2;
        T[] left = Arrays.copyOfRange(list, 0, middle);
        T[] right = Arrays.copyOfRange(list, middle, list.length);
        mergeSort(left, comparator);
        mergeSort(right, comparator);
        merge(left, right, list, comparator);
    }

    private static <T> void merge(T[] left, T[] right, T[] target, Comparator<? super T> comparator) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            target[k++] = comparator.compare(left[i], right[j]) <= 0 ? left[i++] : right[j++];
        }
        while (i < left.length) {
            target[k++] = left[i++];
        }
        while (j < right.length) {
            target[k++] = right[j++];
        }
    }
}
