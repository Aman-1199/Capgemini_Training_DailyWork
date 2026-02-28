import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

 class StudentAttendanceSystem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        HashSet<String> users = new HashSet<>();
        HashMap<String, String> passwords = new HashMap<>();
        HashMap<String, Integer> marks = new HashMap<>();

        while (true) {
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter username: ");
                String username = sc.next();

                if (users.contains(username)) {
                    System.out.println("Username already exists");
                } else {
                    System.out.print("Enter password: ");
                    String password = sc.next();

                    users.add(username);
                    passwords.put(username, password);
                    marks.put(username, random.nextInt(501));

                    System.out.println("Registration successful");
                }
            }

            else if (choice == 2) {
                System.out.print("Enter username: ");
                String username = sc.next();
                System.out.print("Enter password: ");
                String password = sc.next();

                if (users.contains(username) && passwords.get(username).equals(password)) {

                    while (true) {
                        System.out.println("\n1. Download Study Material");
                        System.out.println("2. View Semester Marks");
                        System.out.println("3. Logout");
                        int opt = sc.nextInt();

                        if (opt == 1) {
                            System.out.println("Study material PDF downloaded");
                        }
                        else if (opt == 2) {
                            System.out.println("Total Semester Marks: " + marks.get(username));
                        }
                        else if (opt == 3) {
                            System.out.println("Logged out");
                            break;
                        }
                        else {
                            System.out.println("Invalid choice");
                        }
                    }

                } else {
                    System.out.println("Invalid credentials");
                }
            }

            else if (choice == 3) {
                System.out.println("Program ended");
                break;
            }

            else {
                System.out.println("Invalid choice");
            }
        }
    }
}
