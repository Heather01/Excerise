package Circle;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle() {
        super();
        width = 4;
        length = 6;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String colour, Boolean filled) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return length + length + width + width;
    }

    @Override
    public String toString() {
        return "This is a rectangle with a width of " + width + " and length of " +length+" that has the area of "
                + getArea() + " and the perimeter of " + getPerimeter();
    }

}
