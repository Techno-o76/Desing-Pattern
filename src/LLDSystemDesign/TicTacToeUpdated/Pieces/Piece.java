package LLDSystemDesign.TicTacToeUpdated.Pieces;

public class Piece {
    PieceType piece;
    public Piece(PieceType piece){
        this.piece = piece;
    }

    public String getPieceTypeName(){
        return piece.name();
    }
}
