package Circle;

abstract public class Shape {

    String colour;
    Boolean filled;

    public Shape() {
        colour = "red";
        filled = true;
    }

    public Shape(String colour, Boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();

    abstract public double getPerimeter();

    abstract public String toString();



}
