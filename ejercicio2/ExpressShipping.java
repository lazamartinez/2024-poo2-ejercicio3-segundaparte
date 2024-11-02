package ejercicio2;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateCost() {
        return 15.00;
    }

    @Override
    public String calculateTime() {
        return "2-3 días";
    }
}
