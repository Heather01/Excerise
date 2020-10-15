package Ex3_15;

public class Main {
    public static void main(String[] args) {

        Task task = new Task();
        Integer[] array = {1,2,3,4};
        Integer[] array1 = {1,2,3,4};
        int[] array2 = {1,2,3,4};
        int[] array3 = {1,4,5,2};
        int[] array4 = {1,4,5,2,4,4};
        task.reverse(array);

        task.copyOf(array1);
        task.copyOf(array2, 5);

        Task.swap(array2, array4);
    }



}
