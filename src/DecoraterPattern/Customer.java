package DecoraterPattern;

import DecoraterPattern.DifferentBasePizza.FarmHouse;
import DecoraterPattern.DifferentTopping.ExtraCheesTopping;
import DecoraterPattern.DifferentTopping.MushroomTopping;

public class Customer {
    public static void main(String[] args){
        BasePizza farmHouse = new FarmHouse();
        System.out.println(farmHouse.cost());

        BasePizza mushroomTopping = new MushroomTopping(farmHouse);
        System.out.println(mushroomTopping.cost());

        BasePizza extraCheesTopping = new ExtraCheesTopping(mushroomTopping);
        System.out.println(extraCheesTopping.cost());
    }
}
