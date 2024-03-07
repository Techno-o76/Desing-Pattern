package LLDSystemDesign.SnakeAndLadder.Dice;

import java.util.Random;

public class Dice {
    int sides;
    Random random;
    public Dice(int sides){
        random = new Random();
        this.sides = sides;
    }

    public int roll(){
        int max = sides;
        int min = 1;
        int moves = random.nextInt(max - min + 1) + min;
        return moves;
    }


}
