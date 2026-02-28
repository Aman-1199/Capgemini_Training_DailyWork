import java.util.Scanner;

public class LL_Question {

    static class Node {
        long data;
        Node next;

        Node(long data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;
    static long min, max;

    static void push(long x) {
        if (top == null) {
            top = new Node(x);
            min = x;
            max = x;
        }
        else if (x < min) {
            Node n = new Node(2 * x - min);
            n.next = top;
            top = n;
            min = x;
        }
        else if (x > max) {
            Node n = new Node(2 * x - max);
            n.next = top;
            top = n;
            max = x;
        }
        else {
            Node n = new Node(x);
            n.next = top;
            top = n;
        }
    }

    static void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        long val = top.data;
        top = top.next;

        if (val < min) {
            min = 2 * min - val;
        }
        else if (val > max) {
            max = 2 * max - val;
        }
    }

    static void getMin() {
        if (top == null)
            System.out.println("Stack is empty");
        else
            System.out.println("Min: " + min);
    }

    static void getMax() {
        if (top == null)
            System.out.println("Stack is empty");
        else
            System.out.println("Max: " + max);
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

            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter value: ");
                long x = sc.nextLong();
                push(x);
            }
            else if (ch == 2) {
                pop();
            }
            else if (ch == 3) {
                getMin();
            }
            else if (ch == 4) {
                getMax();
            }
            else {
                break;
            }
        }
        sc.close();
    }
}
