package com.sortalgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    private Integer[] integers;
    private String[] strings;


    @BeforeEach
    void setUp() {
        integers = new Integer[]{10, 55, -5, 34, 7, 22, 19};
        strings = new String[]{"Sylvanas", "Arthas", "Illidan", "Thrall", "Jaina"};
    }

    @Test
    @DisplayName("Insertion Sort - ascending order")
    void givenAnArray_mustSortElementsInAscendingOrder() {
        Integer[] expectedIntegers = {-5, 7, 10, 19, 22, 34, 55};
        String[] expectedStrings = {"Arthas", "Illidan", "Jaina", "Sylvanas", "Thrall"};

        InsertionSort<Integer> integerInsertionSort = new InsertionSort<>(integers, true);
        integerInsertionSort.sort();
        InsertionSort<String> stringInsertionSort = new InsertionSort<>(strings, true);
        stringInsertionSort.sort();

        assertAll(
                () -> assertArrayEquals(expectedIntegers, integers),
                () -> assertArrayEquals(expectedStrings, strings)
        );
    }

    @Test
    @DisplayName("Insertion Sort - descending order")
    void givenAnArray_mustSortElementsInDescendingOrder() {
        Integer[] expectedIntegers = {55, 34, 22, 19, 10, 7, -5};
        String[] expectedStrings = {"Thrall", "Sylvanas", "Jaina", "Illidan", "Arthas"};

        InsertionSort<Integer> integerInsertionSort = new InsertionSort<>(integers, false);
        integerInsertionSort.sort();
        InsertionSort<String> stringInsertionSort = new InsertionSort<>(strings, false);
        stringInsertionSort.sort();

        assertAll(
                () -> assertArrayEquals(expectedIntegers, integers),
                () -> assertArrayEquals(expectedStrings, strings)
        );
    }
}
