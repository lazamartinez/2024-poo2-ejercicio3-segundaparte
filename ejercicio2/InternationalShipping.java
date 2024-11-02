package ejercicio2;

public class InternationalShipping implements ShippingStrategy {
    @Override
    public double calculateCost() {
        return 25.00;
    }

    @Override
    public String calculateTime() {
        return "7-14 días";
    }
}
