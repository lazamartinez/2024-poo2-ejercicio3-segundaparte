package ejercicio3;

public class ExtraCheese extends ToppingDecorator {
    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", queso extra";
    }
}
