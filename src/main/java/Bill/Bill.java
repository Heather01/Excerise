package Bill;

public class Bill {

    private int units;
    private double lowPrice;
    private double highPrice;

    public Bill(int NumberOfUnits) {
        units = NumberOfUnits;
        lowPrice = 26.7;
        highPrice = 15.6;
    }

    public void getPrice() {
        double answer;
        if (units <=100) {
            answer = units*lowPrice;
        }
        else {
            double newUnits = units-100;
            answer = 2670 + (newUnits*highPrice);
        }
        System.out.println("The price is "+ answer+"p");
    }
}
