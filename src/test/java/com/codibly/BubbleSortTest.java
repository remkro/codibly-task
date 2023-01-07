package com.codibly;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void shouldReturnProperlySortedListExample1() {
        List<Comparable> input = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        List<Comparable> result = bubbleSort.sort(input);
        assertEquals(Arrays.asList(1, 3, 4, 5, 6, 8, 8), result);
    }

    @Test
    public void shouldReturnProperlySortedListExample2() {
        List<Comparable> input = Arrays.asList(-9.3, 0.2, 4, 0.1, 5, 9);
        List<Comparable> result = bubbleSort.sort(input);
        assertEquals(Arrays.asList(-9.3,0.1,0.2,4,5,9), result);
    }

    @Test
    public void shouldReturnEmptyListWhenInputIsEmpty() {
        List<Comparable> sort = bubbleSort.sort(Arrays.asList());
        assertEquals(Arrays.asList(), Arrays.asList());
    }

    @Test
    public void shouldReturnListWithoutNullValues() {
        List<Comparable> input = Arrays.asList(null, 5.0001);
        List<Comparable> result = bubbleSort.sort(input);
        assertEquals(Arrays.asList(5.0001), result);
    }

    @Test
    public void shouldThrowRunTimeExceptionWhenInputIsNull() {
        RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
            bubbleSort.sort(null);
        });
        assertEquals("Input cannot be null!", thrown.getMessage());
    }
}