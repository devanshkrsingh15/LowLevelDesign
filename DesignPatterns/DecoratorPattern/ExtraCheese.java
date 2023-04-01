package DesignPatterns.DecoratorPattern;

public class ExtraCheese extends ExtraTopping {
    BasePizza pizza ;

    ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
       return this.pizza.cost() + 30;
    }
    
}
