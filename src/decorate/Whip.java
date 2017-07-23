package decorate;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip (Beverage b) {
        this.beverage = b;
    }

    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }

    public double cost() {
        return 0.1 + beverage.cost();
    }
}
