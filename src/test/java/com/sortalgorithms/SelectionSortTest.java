package com.sortalgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortTest {

    private Integer[] integers;
    private String[] strings;

    @BeforeEach
    void setUp() {
        integers = new Integer[]{10, 55, -5, 34, 7, 22, 19};
        strings = new String[]{"Sylvanas", "Arthas", "Illidan", "Thrall", "Jaina"};
    }

    @Test
    @DisplayName("Selection Sort - ascending order")
    void givenAnArray_mustSortElementsInAscendingOrder() {
        Integer[] expectedIntegers = {-5, 7, 10, 19, 22, 34, 55};
        String[] expectedStrings = {"Arthas", "Illidan", "Jaina", "Sylvanas", "Thrall"};

        SelectionSort<Integer> integerSelectionSort = new SelectionSort<>(integers, true);
        integerSelectionSort.sort();
        SelectionSort<String> stringSelectionSort = new SelectionSort<>(strings, true);
        stringSelectionSort.sort();

        assertAll(
                () -> assertArrayEquals(expectedIntegers, integers),
                () -> assertArrayEquals(expectedStrings, strings)
        );
    }

    @Test
    @DisplayName("Selection Sort - descending order")
    void givenAnArray_mustSortElementsInDescendingOrder() {
        Integer[] expectedIntegers = {55, 34, 22, 19, 10, 7, -5};
        String[] expectedStrings = {"Thrall", "Sylvanas", "Jaina", "Illidan", "Arthas"};

        SelectionSort<Integer> integerSelectionSort = new SelectionSort<>(integers, false);
        integerSelectionSort.sort();
        SelectionSort<String> stringSelectionSort = new SelectionSort<>(strings, false);
        stringSelectionSort.sort();

        assertAll(
                () -> assertArrayEquals(expectedIntegers, integers),
                () -> assertArrayEquals(expectedStrings, strings)
        );
    }
}