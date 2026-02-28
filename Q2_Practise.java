import java.util.Scanner;
import java.util.Stack;

public class Q2_Practise {

    static Stack<Long> stack = new Stack<>();
    static long min, max;

    static void push(long x) {
        if (stack.isEmpty()) {
            stack.push(x);
            min = x;
            max = x;
        }
        else if (x < min) {
            stack.push(2 * x - min);
            min = x;
        }
        else if (x > max) {
            stack.push(2 * x - max);
            max = x;
        }
        else {
            stack.push(x);
        }
    }

    static void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        long top = stack.pop();

        if (top < min) {
            min = 2 * min - top;
        }
        else if (top > max) {
            max = 2 * max - top;
        }
    }

    static long getMin() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return min;
    }

    static long getMax() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Get Min");
            System.out.println("4. Get Max");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                long val = sc.nextLong();
                push(val);
            }
            else if (choice == 2) {
                pop();
            }
            else if (choice == 3) {
                System.out.println("Min: " + getMin());
            }
            else if (choice == 4) {
                System.out.println("Max: " + getMax());
            }
            else {
                break;
            }
        }
        sc.close();
    }
}
