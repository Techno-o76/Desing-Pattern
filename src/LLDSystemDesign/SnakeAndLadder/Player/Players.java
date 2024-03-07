package LLDSystemDesign.SnakeAndLadder.Player;

import LLDSystemDesign.SnakeAndLadder.Board.Cell.Cell;
import LLDSystemDesign.SnakeAndLadder.Board.Cell.Piece;

public class Players {
    private String name;
    private int age;

    private int currentCell;
    private Cell piece;
    public Players(String name,int age,Cell piece){
        this.name = name;
        this.age = age;
        this.piece = piece;
        this.currentCell = 0;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getCurrentCell(){
        return currentCell;
    }

    public void setCurrentCell(int currentCell){
        this.currentCell = currentCell;
    }

    public Cell getPiece(){
        return piece;
    }
}
