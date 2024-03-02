package Patterns.ObserverPattern.DecoraterPattern;

public abstract class ExtraTopping extends BasePizza {
    protected BasePizza basePizza;
    public ExtraTopping(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    public abstract int cost();
}
