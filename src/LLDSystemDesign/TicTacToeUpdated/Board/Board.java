package LLDSystemDesign.TicTacToeUpdated.Board;

import LLDSystemDesign.TicTacToeUpdated.Pieces.Piece;

public class Board {
    public int size;
    public Piece board [][];

    public Board(int size){
        this.size = size;
        board = new Piece[size][size];
        System.out.println("Board Created!!");
    }

    public void setPosition(int a,int b,Piece piece){
        this.board[a][b] = piece;
    }

    public void printBoard(){
            int n = size;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print("| ");
                    if(board[i][j]==null) {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(board[i][j].getPieceTypeName()+" ");
                    }
                    System.out.print("|");
                }
                System.out.println();
            }

    }
}
