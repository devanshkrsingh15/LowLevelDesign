package DesignPatterns.DecoratorPattern;

public class ExtraVeggies extends ExtraTopping {
    BasePizza pizza;
    ExtraVeggies( BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
       return this.pizza.cost() + 40;
    }
    
}