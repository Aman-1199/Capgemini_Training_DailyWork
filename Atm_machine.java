import java.util.Scanner;

 class Atm_machine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 20000;
        int pin = 1234;

        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Check Balance");
        System.out.println("4. Change Pin");
        System.out.println("5. Fast Withdrawal");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount to deposit: ");
            int amount = sc.nextInt();
            balance = balance + amount;
            System.out.println("Updated Balance: " + balance);
        }

        else if (choice == 2) {
            System.out.print("Enter pin: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == pin) {
                System.out.print("Enter withdrawal amount: ");
                int amount = sc.nextInt();

                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Updated Balance: " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
            } else {
                System.out.println("Wrong Pin");
            }
        }

        else if (choice == 3) {
            System.out.print("Enter pin: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == pin) {
                System.out.println("Balance: " + balance);
            } else {
                System.out.println("Wrong Pin");
            }
        }

        else if (choice == 4) {
            System.out.print("Enter old pin: ");
            int oldPin = sc.nextInt();

            if (oldPin == pin) {
                System.out.print("Enter new pin: ");
                pin = sc.nextInt();
                System.out.println("Pin Changed Successfully");
            } else {
                System.out.println("Wrong Pin");
            }
        }

        else if (choice == 5) {
            if (balance >= 5000) {
                balance = balance - 5000;
                System.out.println("5000 Withdrawn");
                System.out.println("Updated Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        }

        else {
            System.out.println("Invalid Choice");
        }
    }
}