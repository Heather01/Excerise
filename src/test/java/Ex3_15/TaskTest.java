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

}
