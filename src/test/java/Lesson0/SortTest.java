package Lesson0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortTest {

    @Test
    void toSort1() {
        int[] array = {2, 3, 5, 10, 1, 6};
        Sort sort = new Sort();
        int[] arrayActual = sort.toSort(array);
        int[] arrayExpected = {1, 2, 3, 5, 6, 10};
        Assertions.assertArrayEquals(arrayExpected, arrayActual);
    }

    @Test
    void toSort2() {
        int[] array = {100, 3, 5, 10, 1, 6};
        Sort sort = new Sort();
        int[] arrayActual = sort.toSort(array);
        int[] arrayExpected = {1, 3, 5, 6, 10, 100};
        Assertions.assertArrayEquals(arrayExpected, arrayActual);
    }

    @Test
    void toSort3() {
        int[] array = {2};
        Sort sort = new Sort();
        int[] arrayActual = sort.toSort(array);
        int[] arrayExpected = {2};
        Assertions.assertArrayEquals(arrayExpected, arrayActual);
    }

    @Test
    void toSort4() {
        int[] array = {};
        Sort sort = new Sort();
        int[] arrayActual = sort.toSort(array);
        int[] arrayExpected = {};
        Assertions.assertArrayEquals(arrayExpected, arrayActual);
    }
}