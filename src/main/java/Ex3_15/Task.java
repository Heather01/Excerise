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

    public String copyOf(Integer[] array1) {
        Integer[] array2;
        array2 = array1;
        System.out.println("array 2 - " + Arrays.toString(array2));
        return Arrays.toString(array2);
    }

    public int[] copyOf(int[] array1, int newLength) {
        int[] array2 = Arrays.copyOf(array1, newLength);
        System.out.println(Arrays.toString(array2));
        return array2;
    }
        public static boolean swap(int[] array1, int[] array2) {
        boolean swap;
        int[] array3;
        if (array1.length == array2.length) {
            System.out.println("Before");
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
            array3 = Arrays.copyOf(array1, array1.length);
            array1 = Arrays.copyOf(array2, array2.length);
            array2 = Arrays.copyOf(array3, array3.length);
            System.out.println("After");
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
            swap=true;
        }
        else{
            swap=false;
        }
            System.out.println(swap);
        return swap;
    }
}