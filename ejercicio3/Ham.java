package ejercicio3;

public class Ham extends ToppingDecorator {
    public Ham(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", jamón";
    }
}
