package LLDSystemDesign.TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int arr[][];
    private int sizeOfTicTacToe;

    List<Player> players;

    public Board(int sizeOfTicTacToe){
        this.sizeOfTicTacToe = sizeOfTicTacToe;
        this.players = new ArrayList<>();
        arr = new int[sizeOfTicTacToe][sizeOfTicTacToe];
        System.out.println("Board is Created! with size of:"+sizeOfTicTacToe);
    }

    public void addPlayers(Player p) {
        this.players.add(p);
    }

    public boolean victory(int playerIndx){
        // check rowWise and columnWise
        for(int i=0;i<this.sizeOfTicTacToe;i++){
            int cntRow = 0, cntCol = 0;
            for(int j=0;j<this.sizeOfTicTacToe;j++){
                if(arr[i][j]==playerIndx){
                    cntRow++;
                }
                if(arr[j][i]==playerIndx){
                    cntCol++;
                }
            }

            if(cntCol==this.sizeOfTicTacToe||cntRow==this.sizeOfTicTacToe){
                return true;
            }
        }


        // diagonal
        int leftDiagonal = 0, rightDiagonal = 0;
        for(int i=0;i<this.sizeOfTicTacToe;i++){
            if(arr[i][i]==playerIndx){
                leftDiagonal++;
            }
            if(arr[i][this.sizeOfTicTacToe-i-1]==playerIndx){
                rightDiagonal++;
            }
        }

        if(leftDiagonal==this.sizeOfTicTacToe||rightDiagonal==this.sizeOfTicTacToe){
            return true;
        }

        return false;

    }

    public boolean validOrIsPossible(int i,int j){
        if(i>=this.sizeOfTicTacToe||j>=this.sizeOfTicTacToe){
            return false;
        }

        if(i<0||j<0){
            return  false;
        }

        if(arr[i][j]==1){
            return false;
        }

        return true;
    }

    private void set(int i,int j,int playerIndx){
        arr[i][j] = playerIndx;
    }

    public boolean notFilled(){
        for(int i=0;i<this.sizeOfTicTacToe;i++){
            for(int j=0;j<this.sizeOfTicTacToe;j++){
                if(arr[i][j]==0) return true;
            }
        }

        return false;
    }

    public int getNumberOfPlayers(){
        return players.size();
    }

    public void print(){
        System.out.println("Current Board Status");
        for(int i=0;i<this.sizeOfTicTacToe;i++){
            for(int j=0;j<this.sizeOfTicTacToe;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int move(int i,int j,int playerIndx){
        if(!validOrIsPossible(i,j)){
            return -1;
        }
        set(i,j,playerIndx);
        if(victory(playerIndx)){
            return 1;
        }

        return 0;
    }




    
}
