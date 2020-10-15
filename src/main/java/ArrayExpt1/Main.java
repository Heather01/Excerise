package ArrayExpt1;
//
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PrintArray print = new PrintArray(5, "3 2 5 6 9");
        System.out.println(print.getValues());

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the number of items: ");
//        int numItems = scanner.nextInt();
//        System.out.println("Enter the value of all items (separated by space): ");
//        String values = scanner.next();
//
//        PrintArray print = new PrintArray(numItems, values);
//        System.out.println("The values are: " + print.getValues());

    }
}
