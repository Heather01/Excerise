package test;

//import java.util.ArrayList;
//import java.util.Scanner;

/*
 * A test driver for the Cylinder class.
 */
public class TestCylinder {
    public static void main(String[] args) {
//        Cylinder cy1 = new Cylinder();
//        System.out.println("Radius is " + cy1.getRadius()
//                + " Height is " + cy1.getHeight()
//                + " Color is " + cy1.getColor()
//                + " Base area is " + cy1.getArea()
//                + " Volume is " + cy1.getVolume());
//
//        Cylinder cy2 = new Cylinder(5.0, 2.0);
//        System.out.println("Radius is " + cy2.getRadius()
//                + " Height is " + cy2.getHeight()
//                + " Color is " + cy2.getColor()
//                + " Base area is " + cy2.getArea()
//                + " Volume is " + cy2.getVolume());

//            System.out.print("Cylinder Number " + i + ": ");
//        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cylinderList = new ArrayList<String>();

        for (int i = 1; i < 10; i++)  {
            double height = (Math.random() * ((100) + 1));
            double heightRounded = Math.round(height * 100.0) / 100.0;   // Creates Answer To The Nearest 100 th, You Can Modify This To Change How It Rounds.
            double radius = (Math.random() * ((100) + 1));
            double radiusRounded = Math.round(radius * 100.0) / 100.0;   // Creates Answer To The Nearest 100 th, You Can Modify This To Change How It Rounds.
            String colour ="red";
            Cylinder cy3 = new Cylinder(heightRounded, radiusRounded, colour, i);
            cylinderList.add(cy3.toString());
            cylinderList.add("\n");
        }

        System.out.println(cylinderList);

    }
}
