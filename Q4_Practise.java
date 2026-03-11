import java.util.Scanner;
import java.util.Stack;

public class Q4_Practise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bars: ");
        int n = sc.nextInt();

        int[] heights = new int[n];
        System.out.println("Enter bar heights:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;

        while (i < n) {
            if (stack.isEmpty() || heights[stack.peek()] <= heights[i]) {
                stack.push(i);
                i++;
            } else {
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = heights[top] * width;
                maxArea = Math.max(maxArea, area);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            int area = heights[top] * width;
            maxArea = Math.max(maxArea, area);
        }

        System.out.println("Largest Rectangle Area: " + maxArea);
        sc.close();
    }
}
