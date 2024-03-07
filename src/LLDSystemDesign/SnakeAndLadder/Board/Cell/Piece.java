package LLDSystemDesign.SnakeAndLadder.Board.Cell;

import LLDSystemDesign.SnakeAndLadder.Board.Cell.PieceType;

public class Piece extends Normal {
    PieceType pieceType;

    public Piece(PieceType pieceType,Integer value){
        super(value);
        this.pieceType = pieceType;
    }

    public String getInfo(){
        return pieceType.name();
    }

    @Override
    public String cellType() {
        return "Piece";
    }

}
