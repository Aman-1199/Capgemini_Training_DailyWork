import java.util.Scanner;
import java.util.Stack;

public class Q10_Practise {

    static void printStack(Stack<String> stack) {
        System.out.println("Call Stack: " + stack);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> callStack = new Stack<>();

        System.out.print("Enter number of actions: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter action (call/return) and method name: ");
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            if (parts[0].equalsIgnoreCase("call")) {
                callStack.push(parts[1]);
                System.out.println("Calling: " + parts[1]);
                printStack(callStack);
            } 
            else if (parts[0].equalsIgnoreCase("return")) {
                if (!callStack.isEmpty()) {
                    System.out.println("Returning from: " + callStack.pop());
                    printStack(callStack);
                } else {
                    System.out.println("Stack is empty");
                }
            }
        }
        sc.close();
    }
}
