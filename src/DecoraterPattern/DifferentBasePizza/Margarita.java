package DecoraterPattern.DifferentBasePizza;

import DecoraterPattern.BasePizza;

public class Margarita extends BasePizza {
    public Margarita(){
        System.out.println("BasePizza Margarita is Prepared");
    }

    @Override
    public int cost(){
        return 100;
    }
}
