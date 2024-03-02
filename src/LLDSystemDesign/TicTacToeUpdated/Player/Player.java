package LLDSystemDesign.TicTacToeUpdated.Player;

import LLDSystemDesign.TicTacToeUpdated.Pieces.Piece;

public class Player {
    private String name;
    private String gender;
    private int age;

    private Piece piece;

    public Player(String name,String gender,int age,Piece piece){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.piece = piece;
    }

    public String getName(){
        return this.name;
    }

    public String getGender(){
        return this.gender;
    }

    public int getAge(){
        return this.age;
    }


    public Piece getPiece(){
        return this.piece;
    }


}
