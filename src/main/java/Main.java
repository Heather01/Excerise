import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Circle circle1 = new Circle();
//        Circle circle2 = new Circle(1.5);

        Scanner input = new Scanner(System.in);
        double inputRadius = input.nextDouble();
        double inputDoubleColour = input.nextDouble();

//        Circle circle3 = new Circle(inputRadius);
        Circle circle4 = new Circle(inputRadius,inputDoubleColour);

        System.out.println( circle4.getColour());



    }
}
