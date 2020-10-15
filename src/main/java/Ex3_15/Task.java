package Ex3_15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task {

    public List<Integer> reverse(Integer[] array) {
        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.asList(array));
        return Arrays.asList(array);
    }
}
