
import java.util.*;

class Player {
    private static char symbol = ' ';
    public static void main(String[] args) {
    }

    public static void setSymbol() {
        Scanner sc = new Scanner(System.in);
        String newSymbol = sc.next();
        symbol = newSymbol.charAt(0);
    }

    public static char getSymbol() {
        return symbol;
    }

    public static void wrongSymbol() {
        System.out.println("You have entered the same symbol as the other player.");
        System.out.println("Please enter another symbol.");
    }

}