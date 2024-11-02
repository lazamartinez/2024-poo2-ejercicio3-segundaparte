package ejercicio3;

public class BasicPizza implements Pizza {
    @Override
    public double getCost() {
        return 5.00; // Costo base de la pizza
    }

    @Override
    public String getDescription() {
        return "Pizza básica";
    }
}
