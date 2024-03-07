package LLDSystemDesign.SnakeAndLadder;

import LLDSystemDesign.SnakeAndLadder.Board.Board;
import LLDSystemDesign.SnakeAndLadder.Board.Cell.Cell;
import LLDSystemDesign.SnakeAndLadder.Board.Cell.Piece;
import LLDSystemDesign.SnakeAndLadder.Board.Cell.PieceType;
import LLDSystemDesign.SnakeAndLadder.Dice.Dice;
import LLDSystemDesign.SnakeAndLadder.Player.Players;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        System.out.println("Welcome to snake and Ladder");

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the Board size");
        int boardsize = sc.nextInt();
        Board board = new Board(boardsize);

        System.out.println("Enter Dice Side");
        int diceSide = sc.nextInt();

        Dice dice = new Dice(diceSide);

        System.out.println("Enter Number of Players");
        int noOfPlayers = sc.nextInt();
        List<Players> playersList = new ArrayList<>();

        while(noOfPlayers>0){
            System.out.println("Enter your Name");
            String name = sc.nextLine();
            System.out.println(name);
            sc.nextLine();
            int age = sc.nextInt();
            Cell peice = new Piece(PieceType.A,(Integer)0);
            Players player = new Players(name,age,peice);
            playersList.add(player);
            noOfPlayers--;
        }


        boolean noWinner = true;

        int i = 0;
        Players winner = null;

        while(noWinner){
            board.printBoard();

            Players p = playersList.get(i);
            System.out.println(p.getName()+" Turn ");

            int move = dice.roll();

            while(!board.validMove(p.getCurrentCell(),move,p.getPiece())){
                System.out.println("Invald move, please try again");
            }
            System.out.println("Dice rolled with value: "+move);

            board.setBoard(p.getCurrentCell(),move,p.getPiece());



            if(board.isWinner(p.getCurrentCell())){
                noWinner = false;
                winner = p;
            }

            i++;
            i = i%playersList.size();
        }


        System.out.println("Congratulations!!!! "+winner.getName()+"is the winner🥳🥳");
        sc.close();

        System.out.println("Game over!");
    }
}
