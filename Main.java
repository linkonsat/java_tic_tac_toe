interface Menu {
    public void introduction();
}

class Instructions implements Menu {
    public void introduction() {
        System.out.println("Welcome to tic-tac-toe.");
        System.out.println("Your goal is to get 3 of your symbol up, down, across or diagonally.");
        System.out.println("Go ahead and your symbol player 1.")
    }
}

class Main {
    public static void main(String[] args) {
    Instructions instructions = new Instructions();
    instructions.introduction();
    }
}
