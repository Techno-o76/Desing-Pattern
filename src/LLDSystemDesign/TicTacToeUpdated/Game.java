package LLDSystemDesign.TicTacToeUpdated;

import LLDSystemDesign.TicTacToeUpdated.Board.Board;
import LLDSystemDesign.TicTacToeUpdated.Pieces.Piece;
import LLDSystemDesign.TicTacToeUpdated.Pieces.PieceX;
import LLDSystemDesign.TicTacToeUpdated.Pieces.PieceY;
import LLDSystemDesign.TicTacToeUpdated.Player.Player;

import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Game game = new Game();
        Pair<List<Player>,Board> obj1 = game.intilize();
        System.out.println(game.start(obj1));
    }



    public void printList(List<Piece> pieceList){
        int i = 0;
        for(Piece piece: pieceList){
            System.out.println(i+": "+piece.getPieceTypeName());
            i++;
        }

    }

    public Pair<List<Player>,Board> intilize(){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of Tic-Tac-Toe");
            int size = sc.nextInt();
            Board board = new Board(size);

            System.out.println("Enter the number of Players");

            // current implementation only support 2 players
            int noOfPlayers = sc.nextInt();

            List<Piece> pieceList = new ArrayList<>();

            pieceList.add(new PieceX());
            pieceList.add(new PieceY());


            List<Player> playerList = new ArrayList<>();

            if (noOfPlayers > pieceList.size()) {
                System.out.println("Invalid Game Setting!");
            }

            while (noOfPlayers > 0) {

                System.out.println("Enter your Details!");

                sc.nextLine();
                System.out.println("Enter your Name :");
                String name = sc.nextLine();

                System.out.println("Enter your Gender :");
                String gender = sc.nextLine();

                System.out.println("Enter your Age");
                int age = sc.nextInt();

                System.out.println("Enter the Piece you want to play with! from the following list!");


                int choice;
                while (true) {
                    printList(pieceList);
                    choice = sc.nextInt();
                    if (choice >= pieceList.size()) {
                        System.out.println("Enter a valid input!");
                    } else break;
                }
                Player p = new Player(name, gender, age, pieceList.get(choice));
                pieceList.remove(choice);
                playerList.add(p);

                noOfPlayers--;
            }

            return new Pair<>(playerList,board);
    }



    public boolean valid(int a,int b,Board board){
        int size = board.size;
        if(a>=size||b>=size) return false;
        if(a<0||b<0) return false;

        if(board.board[a][b]!=null){
            return false;
        }

        return true;
    }

    public boolean checkWinningStatus(Board board,Piece piece){
        // check rowWise and columnWise
        int size = board.size;
        for(int i=0;i<size;i++){
            int cntRow = 0, cntCol = 0;
            for(int j=0;j<size;j++){
                if(board.board[i][j]==piece){
                    cntRow++;
                }
                if(board.board[j][i]==piece){
                    cntCol++;
                }
            }

            if(cntCol==size||cntRow==size){
                return true;
            }
        }


        // diagonal
        int leftDiagonal = 0, rightDiagonal = 0;
        for(int i=0;i<size;i++){
            if(board.board[i][i]==piece){
                leftDiagonal++;
            }
            if(board.board[i][size-i-1]==piece){
                rightDiagonal++;
            }
        }

        if(leftDiagonal==size||rightDiagonal==size){
            return true;
        }

        return false;
    }
    public String start(Pair<List<Player>,Board> game){

        List<Player> playerList = game.getKey();
        Board board = game.getValue();
        Scanner sc = new Scanner(System.in);

        boolean noWinner = true;
        int i = 0;

        int totalMoves = board.size*board.size;

        while(noWinner && totalMoves > 0 ){

            board.printBoard();
            System.out.println(playerList.get(i).getName()+" Turn!");

            int a = sc.nextInt();
            int b = sc.nextInt();

            while(!valid(a,b,board)){
                System.out.println("Enter a valid poistion!");
                a = sc.nextInt();
                b = sc.nextInt();
            }

            board.setPosition(a,b,playerList.get(i).getPiece());

            if(checkWinningStatus(board,playerList.get(i).getPiece())){
                sc.close();
                board.printBoard();
                return "Winner of the Game is " + playerList.get(i).getName();
            }


            i++;
            i %= playerList.size();
            totalMoves--;
        }

        sc.close();
        return "Draw";


    }


}
