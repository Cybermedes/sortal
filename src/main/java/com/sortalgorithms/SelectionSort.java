package com.sortalgorithms;

public class SelectionSort<T extends Comparable<T>> {

    private final T[] arr;
    private final boolean isAscending;

    public SelectionSort(T[] arr, boolean isAscending) {
        this.arr = arr;
        this.isAscending = isAscending;
    }

    public void sort() {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (isAscending) {
                    if (arr[j].compareTo(arr[minIndex]) < 0) {
                        minIndex = j;
                    }
                } else {
                    if (arr[j].compareTo(arr[minIndex]) > 0) {
                        minIndex = j;
                    }
                }
            }
            if (minIndex != i) {
                T temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
