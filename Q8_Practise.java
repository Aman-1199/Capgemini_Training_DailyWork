import java.util.Scanner;
import java.util.Stack;

public class Q8_Practise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] price = new int[n];
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }

        System.out.println("Stock Span:");
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }

        sc.close();
    }
}
