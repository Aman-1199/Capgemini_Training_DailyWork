import java.util.ArrayList;
import java.util.Scanner;

public class studentData {

    public static void main(String[] args) {

        ArrayList<String> stdata = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for add name");
        System.out.println("Press 2 for updating name");
        System.out.println("Press 3 for removing");

        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {

            case 1:
                System.out.println("Enter the name of student:");
                String name = sc.nextLine();
                stdata.add(name);
                System.out.println(stdata);
                break;

            case 2:
                if (stdata.isEmpty()) {
                    System.out.println("No data to update");
                } else {
                    System.out.println("Enter updated name:");
                    String up = sc.nextLine();
                    stdata.set(0, up);
                    System.out.println(stdata);
                }
                break;

            case 3:
                if (stdata.isEmpty()) {
                    System.out.println("No data to remove");
                } else {
                    stdata.remove(0);
                    System.out.println("Data removed");
                }
                break;

            default:
                System.out.println("Wrong Input");
        }

        sc.close();
    }
}