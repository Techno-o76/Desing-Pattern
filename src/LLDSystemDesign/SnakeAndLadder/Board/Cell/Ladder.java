package LLDSystemDesign.SnakeAndLadder.Board.Cell;

import LLDSystemDesign.SnakeAndLadder.Board.Cell.Normal;

public class Ladder extends Normal {

    Integer end;
    public Ladder(Integer start, Integer end){
        super(start);
        this.end = end;
    }

    public Integer getStart(){
        return super.getValue();
    }

    public Integer getEnd(){
        return end;
    }

    @Override
    public String cellType() {
        return "ladder";
    }
}
