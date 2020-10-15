package Circle;

//import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//        Circle circle1 = new Circle();
//        System.out.println("This is the fist instance of the circle's radius " + circle1.getRadius() + " and colour " + circle1.getColour());
//
//        Circle circle2 = new Circle(1.5);
//        System.out.println("This is the fist instance of the circle's radius " + circle2.getRadius() + " and colour " + circle2.getColour());
//
//
//        Scanner input = new Scanner(System.in);
//
//        double inputRadius = input.nextDouble();
//        Circle circle3 = new Circle(inputRadius);
//        System.out.println("This is the fist instance of the circle's radius " + circle3.getRadius() + " and colour " + circle3.getColour());

//        double inputRadius2 = input.nextDouble();
//        double inputDoubleColour = input.nextDouble();
//        Circle circle4 = new Circle(inputRadius2,inputDoubleColour);
//        System.out.println("This is the fist instance of the circle's radius " + circle4.getRadius() + " and colour " + circle4.getColour());
//
//        Circle circle5 = new Circle();
//        System.out.println(circle5.toString());
//
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle.toString());

        System.out.println("Using Polymorphism");

        Shape circle = new Circle();
        circle.toString();

        Shape rectangle = new Rectangle();
        rectangle.toString();

        Shape square = new Square();
        square.toString();



        System.out.println("Using the subclasses");

        Circle circle2 = new Circle();
        circle2.toString();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.toString();

        Square square2 = new Square();
        square2.toString();

    }
}
