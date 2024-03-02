package LLDSystemDesign.TicTacToe;

import java.util.Scanner;

public class play {
    public static  void main(String[] args){
        Board board = new Board(3);
        Player p1 = new Player("Jayesh",22,"Male");
        Player p2 = new Player("Thanmai",20,"Female");

        board.addPlayers(p1);
        board.addPlayers(p2);

        Scanner sc = new Scanner(System.in);

        int i = 0;
        int n = board.getNumberOfPlayers();
        while(board.notFilled()){
            System.out.println(board.players.get(i).name+" Turn!");
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();

            int val = board.move(a,b,i+1);
            board.print();

            if(val==-1){
                System.out.println("InValid Move!");
            }
            else if(val==1){
                System.out.println(board.players.get(i).name+" Victory !!!");
                break;
            }
            else{
                System.out.println("Update Successfull");
                i++;
                i=i%n;
            }
        }
        board.print();

    }
}
