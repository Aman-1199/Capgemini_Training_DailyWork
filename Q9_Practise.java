import java.util.Scanner;
import java.util.Stack;

public class Q9_Practise {

    static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty())
            return;

        int top = stack.pop();
        sortStack(stack);
        insertSorted(stack, top);
    }

    static void insertSorted(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        insertSorted(stack, value);
        stack.push(temp);
    }

    static void printStack(Stack<Integer> stack) {
        if (stack.isEmpty())
            return;

        int top = stack.pop();
        printStack(stack);
        System.out.print(top + " ");
        stack.push(top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        sortStack(stack);

        System.out.println("Sorted Stack:");
        printStack(stack);

        sc.close();
    }
}
