package com.sortalgorithms;

public class InsertionSort<T extends Comparable<T>> {

    private final T[] arr;
    private final boolean isAscending;

    public InsertionSort(T[] arr, boolean isAscending) {
        this.arr = arr;
        this.isAscending = isAscending;
    }

    public void sort() {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (isAscending) {
                    if (arr[j].compareTo(arr[j - 1]) < 0) {
                        T temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    } else {
                        break;
                    }
                } else {
                    if (arr[j].compareTo(arr[j - 1]) > 0) {
                        T temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
