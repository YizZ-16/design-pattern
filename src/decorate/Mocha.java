package decorate;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha (Beverage b) {
        this.beverage = b;
    }

    public String getDescription(){
        return beverage.getDescription()+", Mocha";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }
}

