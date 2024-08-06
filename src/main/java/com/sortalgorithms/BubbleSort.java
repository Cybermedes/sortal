package com.sortalgorithms;

public class BubbleSort<T extends Comparable<T>> {

    private final T[] arr;
    private final boolean isAscending;

    public BubbleSort(T[] arr, boolean isAscending) {
        this.arr = arr;
        this.isAscending = isAscending;
    }

    public void sort() {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean didSwap = false;
            for (int j = 0; j < arr.length -i- 1; j++) {
                if (isAscending) {
                    if (arr[j].compareTo(arr[j + 1]) > 0) {
                        T temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        didSwap = true;
                    }
                } else {
                    if (arr[j].compareTo(arr[j + 1]) < 0) {
                        T temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        didSwap = true;
                    }
                }
            }
            if (!didSwap) {
                break;
            }
        }
    }
}
