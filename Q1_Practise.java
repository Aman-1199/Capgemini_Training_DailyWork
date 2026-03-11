import java.util.Scanner;
import java.util.Stack;

public class Q1_Practise {

    static Stack<Integer> undoStack = new Stack<>();

    static boolean isValid(String exp) {
        Stack<Character> s = new Stack<>();
        for (char c : exp.toCharArray()) {
            if (c == '(') s.push(c);
            if (c == ')') {
                if (s.isEmpty()) return false;
                s.pop();
            }
        }
        return s.isEmpty();
    }

    static int precedence(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        return -1;
    }

    static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        String postfix = "";

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isDigit(c)) {
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    postfix += exp.charAt(i);
                    i++;
                }
                postfix += " ";
                i--;
            }
            else if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                while (stack.peek() != '(')
                    postfix += stack.pop() + " ";
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c))
                    postfix += stack.pop() + " ";
                stack.push(c);
            }
        }

        while (!stack.isEmpty())
            postfix += stack.pop() + " ";

        return postfix;
    }

    static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        undoStack.clear();

        for (String s : exp.split(" ")) {
            if (s.equals("")) continue;

            if (Character.isDigit(s.charAt(0))) {
                stack.push(Integer.parseInt(s));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                if (s.equals("+")) result = a + b;
                if (s.equals("-")) result = a - b;
                if (s.equals("*")) result = a * b;
                if (s.equals("/")) result = a / b;

                stack.push(result);
                undoStack.push(result);   
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter infix expression: ");
        String exp = sc.nextLine().replaceAll("\\s+", "");

        if (!isValid(exp)) {
            System.out.println("Invalid Expression");
            return;
        }

        String postfix = infixToPostfix(exp);
        int finalResult = evaluatePostfix(postfix);

        System.out.println("Final Result: " + finalResult);

        while (true) {
            System.out.print("Press 1 for UNDO, 0 to Exit: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                if (!undoStack.isEmpty()) {
                    undoStack.pop();
                    if (!undoStack.isEmpty())
                        System.out.println("UNDO Result: " + undoStack.peek());
                    else
                        System.out.println("No previous calculation available");
                } else {
                    System.out.println("Nothing to UNDO");
                }
            } else {
                break;
            }
        }
        sc.close();
    }
}
