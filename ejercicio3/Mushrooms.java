package ejercicio3;

public class Mushrooms extends ToppingDecorator {
    public Mushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.75;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", champiñones";
    }
}
