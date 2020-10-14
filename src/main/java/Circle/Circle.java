package Circle;

public class Circle {

    private String colour;
    private double radius;

    public Circle() {
        radius = 1.0;
        colour = "red";
    }

    public Circle(double r) {
        radius = r;
        colour = "red";
    }

    public Circle(double r, String colour) {
        radius = r;
        setColour(colour);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double rSquare = radius*radius;
        return rSquare*Math.PI;
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
