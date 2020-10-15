package Ex3_15;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    Task task = new Task();

    @Test
    public void testReverse() {
        Integer[] input = {1,2,3,4};
        Integer[] expected = {4,3,2,1};
        assertEquals(Arrays.asList(expected), task.reverse(input));
    }

    @Test
    public void testCopyOf() {
        Integer[] input = {1,2,3,4};
        Integer[] expected = {1,2,3,4};
        assertEquals(Arrays.toString(expected), task.copyOf(input));
    }

    @Test
    public void testBuiltInFunctionCopyOf() {
        int[] input = {1,2,3,4};
        int[] expected = {1,2,3,4,0};
        assertEquals(Arrays.toString(expected), Arrays.toString(task.copyOf(input,5)));
    }

    @Test
    public void testSwap() {
        int[] array1 = {1,2,3,4};
        int[] array2 = {4,5,7,2};
        assertEquals(true, task.swap(array1, array2));
    }

    @Test
    public void testSwapFalse() {
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,3,4,0};
        assertEquals(false, task.swap(array1, array2));
    }

}
