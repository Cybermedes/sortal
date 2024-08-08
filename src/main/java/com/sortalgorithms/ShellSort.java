package com.sortalgorithms;

public class ShellSort<T extends Comparable<T>> {

    private final T[] arr;
    private final boolean isAscending;

    public ShellSort(T[] arr, boolean isAscending) {
        this.arr = arr;
        this.isAscending = isAscending;
    }

    public void sort() {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j >= gap; j -= gap) {
                    if (isAscending) {
                        if (arr[j].compareTo(arr[j - gap]) < 0) {
                            T temp = arr[j];
                            arr[j] = arr[j - gap];
                            arr[j - gap] = temp;
                        } else {
                            break;
                        }
                    } else {
                        if (arr[j].compareTo(arr[j - gap]) > 0) {
                            T temp = arr[j];
                            arr[j] = arr[j - gap];
                            arr[j - gap] = temp;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
    }
}
