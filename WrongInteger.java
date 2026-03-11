import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class WrongInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 5 Integers");
        int sum =0;
        int count=0;
        try{
        while (count < 5) {
            try {
                int num = sc.nextInt();
                sum += num;
                count++;
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integer.");
                sc.next();  // clear wrong input
            }

        }}
        catch (NoSuchElementException e ) {
            System.out.println("No more input available.");
        }
        System.out.println(sum);
    }
}
