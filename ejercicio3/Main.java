package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());

        pizza = new ExtraCheese(pizza);
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());

        pizza = new Ham(pizza);
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());

        pizza = new Mushrooms(pizza);
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());
    }
}
