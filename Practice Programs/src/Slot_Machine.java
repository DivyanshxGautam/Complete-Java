import java.util.Scanner;

public class Slot_Machine {
    static void main() {
        // JAVA SLOT MACHINE

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;

        System.out.println("**************************");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐ ");
        System.out.println("**************************");

        while(balance>0){
            System.out.println("Current balance: $" + balance);
            System.out.println("Place your bet amount: ");
            bet = scanner.nextInt();

            if(bet>balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
        }


        // VERIFY IF BET > BALANCE
        // VERIFY IF BET > 0
        // SUBTRACT BRT FROM BALANCE
        // SPIN ROW
        // PRINT ROW
        // GET PAYOUT
        // ASK TO PLAY AGAIN
        // DISPLAY EXIT MESSAGE

    }
}
