package factory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }else if (type.equals("peperoni")) {
            pizza = new PeperoniPizza();
        }else if (type.equals("calm")) {
            pizza = new CalmPizza();
        }else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }

}
