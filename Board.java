import java.io.*;
class Board {
    private static char[][] board = new char[3][3];
    public static void main(String[] args) {
        
    }

    public static char[][] getBoard() {
        return board;
    }

    public static void setBoardSpot(int row, int collumn, char newSymbol) {
        board[row][collumn] = newSymbol;
    }

    public static char getBoardSpot(int row, int collumn) {
        return board[row][collumn];
    }   

    public static void setBoard(char placeholder) {
        for (int i = 0; i <= board.length - 1 ; i++) {
            for (int z = 0; z <= board.length - 1; z++) {
                board[i][z] = placeholder;
            }
        }
    }

    public static void displayBoard() {
        for(int i = 0; i <= board.length - 1; i++) {
            System.out.println(board[i]);
        }
    }
}

