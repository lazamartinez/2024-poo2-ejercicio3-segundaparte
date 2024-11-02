package ejercicio2;

public class ShippingContext {
    private ShippingStrategy strategy;

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public void showShippingDetails() {
        System.out.println("Costo de envío: $" + strategy.calculateCost());
        System.out.println("Tiempo estimado: " + strategy.calculateTime());
    }
}
