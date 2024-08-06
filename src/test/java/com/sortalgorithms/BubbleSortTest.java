package com.sortalgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    private Integer[] integers;
    private String[] strings;

    @BeforeEach
    void setUp() {
        integers = new Integer[]{10, 55, -5, 34, 7, 22, 19};
        strings = new String[]{"Sylvanas", "Arthas", "Illidan", "Thrall", "Jaina"};
    }

    @Test
    @DisplayName("Bubble Sort - ascending order")
    void givenAnArray_mustSortElementsInAscendingOrder() {
        Integer[] expectedIntegers = {-5, 7, 10, 19, 22, 34, 55};
        String[] expectedStrings = {"Arthas", "Illidan", "Jaina", "Sylvanas", "Thrall"};

        BubbleSort<Integer> integerBubbleSort = new BubbleSort<>(integers, true);
        integerBubbleSort.sort();
        BubbleSort<String> stringBubbleSort = new BubbleSort<>(strings, true);
        stringBubbleSort.sort();

        assertAll(
                () -> assertArrayEquals(expectedIntegers, integers),
                () -> assertArrayEquals(expectedStrings, strings)
        );
    }

    @Test
    @DisplayName("Bubble Sort - descending order")
    void givenAnArray_mustSortElementsInDescendingOrder() {
        Integer[] expectedIntegers = {55, 34, 22, 19, 10, 7, -5};
        String[] expectedStrings = {"Thrall", "Sylvanas", "Jaina", "Illidan", "Arthas"};

        BubbleSort<Integer> integerBubbleSort = new BubbleSort<>(integers, false);
        integerBubbleSort.sort();
        BubbleSort<String> stringBubbleSort = new BubbleSort<>(strings, false);
        stringBubbleSort.sort();

        assertAll(
                () -> assertArrayEquals(expectedIntegers, integers),
                () -> assertArrayEquals(expectedStrings, strings)
        );
    }
}
