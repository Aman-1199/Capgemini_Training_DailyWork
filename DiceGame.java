import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int choice;

        while (true) {
            System.out.println("\n--- DICE GAME ---");
            System.out.println("1. Roll the Dice");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int dice = random.nextInt(6) + 1; // 1 to 6
                    System.out.println("Dice rolled!");
                    System.out.println("Your score: " + dice);
                    break;

                case 2:
                    System.out.println("Exiting game. Thanks for playing!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please enter 1 or 2.");
            }
        }
    }
}