package decorate;

public abstract class Beverage {

    protected String description = "Unknown Beverage";
   // private float money;

    protected String getDescription() {return description;}

    public abstract double cost();
}
