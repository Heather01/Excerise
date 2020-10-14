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

    public void setColour(double number) {
        if(number<10) {
            colour = "red";
        }
        else if(number>=10 && number<50) {
            colour = "amber";
        }
        else {
            colour = "green";
        }
    }

}
