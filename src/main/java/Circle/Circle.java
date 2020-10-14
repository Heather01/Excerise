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

    public Circle(double r, double colourNumber) {
        radius = r;
        setColour(colourNumber);
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
        if(number >= 0 && number<=5) {
            colour = "red";
        }
        else if(number > 5 && number<=10) {
            colour = "amber";
        }
        else if(number > 10 && number<=15) {
            colour = "blue";
        }
        else if(number > 15 && number<=20) {
            colour = "purple";
        }
        else if(number >20  && number<=25) {
            colour = "yellow";
        }
        else if(number >25) {
            colour = "pink";
        }
    }

}
