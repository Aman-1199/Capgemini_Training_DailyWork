import java.util.Scanner;
import java.util.Stack;

public class Q3_Practise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter encoded string: ");
        String s = sc.nextLine();

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String current = "";
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(num);
                stringStack.push(current);
                num = 0;
                current = "";
            }
            else if (ch == ']') {
                int repeat = countStack.pop();
                String prev = stringStack.pop();
                String temp = "";

                for (int j = 0; j < repeat; j++) {
                    temp += current;
                }
                current = prev + temp;
            }
            else {
                current += ch;
            }
        }

        System.out.println("Decoded string: " + current);
        sc.close();
    }
}
