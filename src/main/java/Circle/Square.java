package Circle;

public class Square extends Rectangle {

    private double side;

    public Square() {
        super();
        side=4;
    }

    public Square(double side) {
        super();
        this.side=side;
    }

    public Square(double side, String colour, Boolean filled) {
        super(side, side,colour,filled);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side=side;
    }

    @Override
    public void setWidth(double side) {
        this.side=side;
    }

    @Override
    public void setLength(double side) {
        this.side=side;
    }
    @Override
    public String toString() {
        return "This is a square with a side of " + side;
    }
}
