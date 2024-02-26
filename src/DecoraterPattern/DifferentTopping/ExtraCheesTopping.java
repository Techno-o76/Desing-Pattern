package DecoraterPattern.DifferentTopping;

import DecoraterPattern.BasePizza;
import DecoraterPattern.ExtraTopping;

public class ExtraCheesTopping extends ExtraTopping {

    // constructor injection
    public ExtraCheesTopping(BasePizza basePizza){
        super(basePizza);
        System.out.println("Extra Topping of ExtraChess is Added");
    }

    @Override

    public int cost(){
        return this.basePizza.cost()+10;
    }
}
