package ejercicio2;

public class RegularShipping implements ShippingStrategy {
    @Override
    public double calculateCost() {
        return 5.00;
    }

    @Override
    public String calculateTime() {
        return "5-7 días";
    }
}
