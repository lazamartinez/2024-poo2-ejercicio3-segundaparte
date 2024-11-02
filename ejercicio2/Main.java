package ejercicio2;

public class Main {
    public static void main(String[] args) {
        ShippingContext context = new ShippingContext();

        context.setStrategy(new RegularShipping());
        context.showShippingDetails();

        context.setStrategy(new ExpressShipping());
        context.showShippingDetails();

        context.setStrategy(new InternationalShipping());
        context.showShippingDetails();
    }
}
