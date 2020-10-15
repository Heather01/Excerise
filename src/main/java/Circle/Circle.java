package Circle;

public class Circle extends Shape{

    private double radius;

    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double r) {
        super();
        radius = r;
    }

    public Circle(double r, String colour, Boolean filled) {
        super(colour, filled);
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "This is a circle with a radius of "+ radius+ " that has the area of " + getArea()+ " and the perimeter of "+
                getPerimeter();
    }


}
