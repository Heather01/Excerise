package CourseWorkWeek3;

/*
 * A Cylinder is a Circle plus a height.
 */
public class Cylinder extends Circle {
    // private instance variable
    private double height;
    private int index;
    private StringBuilder message;

    // Constructors
    public Cylinder() {
        super();  // invoke superclass' constructor Circle()
        this.height = 1.0;
    }
    public Cylinder(double height) {
        super();  // invoke superclass' constructor Circle()
        this.height = height;
    }
    public Cylinder(double height, double radius) {
        super(radius);  // invoke superclass' constructor Circle(radius)
        this.height = height;
    }

    public Cylinder(double height, double radius, String color, int index) {
        super(radius, color);  // invoke superclass' constructor Circle(radius, color)
        this.height = height;
        this.index = index;
        message = new StringBuilder();
    }



    // Getter and Setter
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    // Return the volume of this Cylinder
    public double getVolume() {
        return getArea()*height;   // Use Circle's getArea()
    }

    // Describle itself
    public String toString() {
        message.append("Cylinder Number ");
        message.append(index);
        message.append(" : Radius is ");
        message.append(getRadius());
        message.append(" Height is ");
        message.append(height);
        message.append(" Colour is ");
        message.append(getColor());
        message.append(" Base area is ");
        message.append(getArea());
        message.append(" Volume is ");
        message.append(getVolume());
        return message.toString();  // to be refined later
    }
}
//    Cylinder Number 1 : Radius is 5.0 Height is 2.0 Color is red Base area is
//        78.53981633974483 Volume is 157.07963267948966
