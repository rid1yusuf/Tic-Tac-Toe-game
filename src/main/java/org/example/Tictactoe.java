package org.example;

import java.util.Scanner;

public class Tictactoe {
    public static void ticTacToe(){
        char[][] board = new char[3][3];
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board.length; column++){
                board[row][column] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = Boolean.parseBoolean("False");

        Scanner scanner = new Scanner(System.in);

        while(!gameOver){
            printBoard(board);
            System.out.println("Player" + player + "enter:");
            int row = scanner.nextInt();
            int column = scanner.nextInt();

            if(board[row][column] == ' '){
                board[row][column] = player; // place the element
                gameOver = haveWon(board, player);
                if(gameOver){
                    System.out.println("Player" + player + "has won:");
                }else{
                    if(player == 'X'){
                    }else {
                        player = 'X';
                    }
                }

            }else {
                System.out.println("Invalid move. Try again");
            }
        }
        printBoard(board);


    }

    private static boolean haveWon(char[][] board, char player) {
        // check the rows
        for(int row = 0; row < board.length; row++){
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }

        // check for column
        for(int column = 0; column < board[0].length; column++){
            if(board[0][column] == player && board[1][column] == player && board[2][column] == player){
                return true;
            }
        }


        // check for diagonal
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }

    private static void printBoard(char[][] board) {
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board.length; column++){
                System.out.print(board[row][column] + " | ");
            }
            System.out.println();
        }
    }
}
