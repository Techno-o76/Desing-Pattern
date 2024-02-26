package DecoraterPattern.DifferentTopping;

import DecoraterPattern.BasePizza;
import DecoraterPattern.ExtraTopping;

public class ExtraCheesTopping extends ExtraTopping {
    BasePizza basepizza;

    // constructor injection
    public ExtraCheesTopping(BasePizza basepizza){
        System.out.println("Extra Topping of ExtraChess is Added");
        this.basepizza = basepizza;
    }

    @Override
    public int cost(){
        return this.basepizza.cost()+10;
    }
}
