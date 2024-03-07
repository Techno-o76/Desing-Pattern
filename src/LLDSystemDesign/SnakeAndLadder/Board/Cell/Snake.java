package LLDSystemDesign.SnakeAndLadder.Board.Cell;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Snake extends Normal{

    Integer end;
    public Snake(Integer start, Integer end){
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
        return "Snake";
    }
}
