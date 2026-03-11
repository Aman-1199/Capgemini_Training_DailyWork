import java.util.Scanner;
import java.util.Stack;

public class Q5_Practise {

    static int findCelebrity(int[][] M, int n) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();

            if (M[a][b] == 1)
                stack.push(b);
            else
                stack.push(a);
        }

        int candidate = stack.pop();

        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                if (M[candidate][i] == 1 || M[i][candidate] == 0)
                    return -1;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        int[][] M = new int[n][n];
        System.out.println("Enter matrix values:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        int result = findCelebrity(M, n);

        if (result == -1)
            System.out.println("No Celebrity Found");
        else
            System.out.println("Celebrity is person: " + result);

        sc.close();
    }
}
