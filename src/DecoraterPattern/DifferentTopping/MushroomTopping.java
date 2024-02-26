package DecoraterPattern.DifferentTopping;

import DecoraterPattern.BasePizza;
import DecoraterPattern.ExtraTopping;

public class MushroomTopping extends ExtraTopping {
    BasePizza basepizza;

    // constructor injection
    public MushroomTopping(BasePizza basepizza){
        System.out.println("Extra topping of Mushroom is added");
        this.basepizza = basepizza;
    }

    @Override
    public int cost(){
        return this.basepizza.cost()+20;
    }
}
