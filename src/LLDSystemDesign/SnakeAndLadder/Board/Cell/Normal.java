package LLDSystemDesign.SnakeAndLadder.Board.Cell;

public class Normal implements Cell {


    Integer value;

    public Normal(Integer value){
        this.value = value;
    }

    public Integer getValue(){
        return value;
    }
    @Override
    public String cellType() {
        return "Normal";
    }
}
