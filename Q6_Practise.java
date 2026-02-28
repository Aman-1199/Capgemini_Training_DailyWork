import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q6_Practise {

    static class StackCostlyPush {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        void push(int x) {
            q2.add(x);
            while (!q1.isEmpty())
                q2.add(q1.remove());
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        int pop() {
            if (q1.isEmpty()) return -1;
            return q1.remove();
        }
    }

    static class StackCostlyPop {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        void push(int x) {
            q1.add(x);
        }

        int pop() {
            if (q1.isEmpty()) return -1;
            while (q1.size() > 1)
                q2.add(q1.remove());
            int val = q1.remove();
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            return val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackCostlyPush s1 = new StackCostlyPush();
        StackCostlyPop s2 = new StackCostlyPop();

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop (Costly Push Stack)");
            System.out.println("3. Pop (Costly Pop Stack)");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                int x = sc.nextInt();
                s1.push(x);
                s2.push(x);
            }
            else if (choice == 2) {
                System.out.println("Costly Push Stack Pop: " + s1.pop());
            }
            else if (choice == 3) {
                System.out.println("Costly Pop Stack Pop: " + s2.pop());
            }
            else {
                break;
            }
        }
        sc.close();
    }
}
