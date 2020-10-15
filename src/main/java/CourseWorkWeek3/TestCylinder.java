package CourseWorkWeek3;

import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cylinderList = new ArrayList<String>();

        for (int i = 1; i < 101; i++)  {
            System.out.println("Please enter height");
            double height =scanner.nextDouble();
            System.out.println("Please enter radius");
            double radius =scanner.nextDouble();
            System.out.println("Please enter colour");
            String colour =scanner.next();
            Cylinder cy3 = new Cylinder(height, radius, colour, i);
            cylinderList.add(cy3.toString());
        }

        System.out.println(cylinderList);

    }
}
