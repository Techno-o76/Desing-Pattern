package LLDSystemDesign.SnakeAndLadder.Board;

import LLDSystemDesign.SnakeAndLadder.Board.Cell.Cell;
import LLDSystemDesign.SnakeAndLadder.Board.Cell.Ladder;
import LLDSystemDesign.SnakeAndLadder.Board.Cell.Snake;
import LLDSystemDesign.SnakeAndLadder.Dice.Dice;
import LLDSystemDesign.SnakeAndLadder.Board.Cell.Piece;
import LLDSystemDesign.SnakeAndLadder.Player.Players;

import javax.print.attribute.standard.Finishings;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    final int size;
    ArrayList<Cell>[] board;
    Random random;

    public Board(int size){
        this.size = size;
        random = new Random();
        board = new ArrayList[size*size+1];
        intilizeBoard();
        intilizeLadders();
        intilizeSnakes();
    }

    private void intilizeBoard(){
        for(int i=0;i<=size*size;i++){
            board[i] = new ArrayList<>();
        }
    }

    private void intilizeLadders(){

        int noOfLadders = size;
        while(noOfLadders>0){
            int max = size, min = 1;
            Integer a = random.nextInt(max-min+1)+min;
            Integer b = random.nextInt(max-min+1)+min;

            if(a.equals(b)){
                continue;
            }

            if(a>b){
                Integer temp = a;
                a = b;
                b = temp;
            }

            Ladder ladder = new Ladder(a,b);
            board[a].add(ladder);
            noOfLadders--;
        }

    }

    private void intilizeSnakes(){

        int noOfSnakes = size;
        while(noOfSnakes>0){
            int max = size, min = 1;
            Integer a = random.nextInt(max-min+1)+min;
            Integer b = random.nextInt(max-min+1)+min;

            if(a.equals(b)){
                continue;
            }

            if(a>b){
                Integer temp = a;
                a = b;
                b = temp;
            }
            Snake snake = new Snake(a,b);
            board[a].add(snake);
            noOfSnakes--;
        }
    }



    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print("| ");
                if(board[i*size+j]==null){
                    System.out.print(" ");
                }
                else{
                    System.out.print(board[i*size+j].size());
                }
                System.out.print(" |");
            }
            System.out.println();
        }
    }

    public boolean validMove(int prev,int move,Cell cell){
        return prev+move<=size*size;
    }

    public boolean isWinner(int cellNumber){
        return size*size==cellNumber;
    }


    public void setBoard(int prev,int moves,Cell cell) {
        board[prev].remove(cell);
        if(!board[prev+moves].isEmpty()){
            if(board[prev+moves].get(0) instanceof Snake){
                Integer current = ((Snake) board[prev + moves].get(0)).getEnd();
                board[current.intValue()].add(cell);
            }
            else if(board[prev+moves].get(0) instanceof Ladder){
                Integer current = ((Ladder) board[prev+moves].get(0)).getEnd();
                board[current.intValue()].add(cell);
            }
            else{
                board[prev+moves].add(cell);
            }
        }
        else{
            board[prev+moves].add(cell);
        }
    }

    public Cell getStartingAddress(){
        return board[0].get(0);
    }


}
