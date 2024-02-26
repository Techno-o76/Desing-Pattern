package DecoraterPattern.DifferentBasePizza;

import DecoraterPattern.BasePizza;

public class FarmHouse extends BasePizza {

    public FarmHouse(){
        System.out.println("BasePizza FramHouse is Prepared");
    }
    @Override
    public int cost() {
        return 120;
    }
}
