import java.util.*;
class abc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Q1: Sum of all elements
        int q1Sum = 0;
        for (int i = 0; i < n; i++) {
            q1Sum += arr[i];
        }
        System.out.println("Q1 Sum: " + q1Sum);

        // Q2: Min element
        int q2Min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < q2Min)
                q2Min = arr[i];
        }
        System.out.println("Q2 Min: " + q2Min);

        // Q3: Max element
        int q3Max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > q3Max)
                q3Max = arr[i];
        }
        System.out.println("Q3 Max: " + q3Max);

        // Q4: 2nd Max element
        int q4First = Integer.MIN_VALUE;
        int q4Second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > q4First) {
                q4Second = q4First;
                q4First = arr[i];
            } else if (arr[i] > q4Second && arr[i] != q4First) {
                q4Second = arr[i];
            }
        }
        System.out.println("Q4 2nd Max: " + q4Second);

        // Q6: Average of array
        int q6Sum = 0;
        for (int i = 0; i < n; i++) {
            q6Sum += arr[i];
        }
        double q6Avg = (double) q6Sum / n;
        System.out.println("Q6 Average: " + q6Avg);

        // Q7: Sum of even indexed elements
        int q7Sum = 0;
        for (int i = 0; i < n; i += 2) {
            q7Sum += arr[i];
        }
        System.out.println("Q7 Even index sum: " + q7Sum);

        // Q8: Sum of odd indexed elements
        int q8Sum = 0;
        for (int i = 1; i < n; i += 2) {
            q8Sum += arr[i];
        }
        System.out.println("Q8 Odd index sum: " + q8Sum);

        // Q9: Min of even indexed elements
        int q9Min = arr[0];
        for (int i = 0; i < n; i += 2) {
            if (arr[i] < q9Min)
                q9Min = arr[i];
        }
        System.out.println("Q9 Min even index: " + q9Min);

        // Q10: Max of odd indexed elements
        int q10Max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i += 2) {
            if (arr[i] > q10Max)
                q10Max = arr[i];
        }
        System.out.println("Q10 Max odd index: " + q10Max);

        // Q11: Avg of even indexed elements
        int q11Sum = 0, q11Count = 0;
        for (int i = 0; i < n; i += 2) {
            q11Sum += arr[i];
            q11Count++;
        }
        System.out.println("Q11 Avg even index: " + (double) q11Sum / q11Count);

        // Q12: Avg of odd indexed elements
        int q12Sum = 0, q12Count = 0;
        for (int i = 1; i < n; i += 2) {
            q12Sum += arr[i];
            q12Count++;
        }
        System.out.println("Q12 Avg odd index: " + (double) q12Sum / q12Count);

        int mid = n / 2;

        // Q13: Sum of first half
        int q13Sum = 0;
        for (int i = 0; i < mid; i++) {
            q13Sum += arr[i];
        }
        System.out.println("Q13 First half sum: " + q13Sum);

        // Q14: Sum of second half
        int q14Sum = 0;
        for (int i = mid; i < n; i++) {
            q14Sum += arr[i];
        }
        System.out.println("Q14 Second half sum: " + q14Sum);

        // Q15: Min of first half
        int q15Min = arr[0];
        for (int i = 0; i < mid; i++) {
            if (arr[i] < q15Min)
                q15Min = arr[i];
        }
        System.out.println("Q15 First half min: " + q15Min);

        // Q16: Min of second half
        int q16Min = arr[mid];
        for (int i = mid; i < n; i++) {
            if (arr[i] < q16Min)
                q16Min = arr[i];
        }
        System.out.println("Q16 Second half min: " + q16Min);

        // Q17: Max of first half
        int q17Max = arr[0];
        for (int i = 0; i < mid; i++) {
            if (arr[i] > q17Max)
                q17Max = arr[i];
        }
        System.out.println("Q17 First half max: " + q17Max);

        // Q18: Max of second half
        int q18Max = arr[mid];
        for (int i = mid; i < n; i++) {
            if (arr[i] > q18Max)
                q18Max = arr[i];
        }
        System.out.println("Q18 Second half max: " + q18Max);

        // Q19: Avg of first half
        System.out.println("Q19 First half avg: " + (double) q13Sum / mid);

        // Q20: Avg of second half
        System.out.println("Q20 Second half avg: " + (double) q14Sum / (n - mid));

        // Q21: Reverse array
        System.out.print("Q21 Reverse array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Q22: First half reverse
        System.out.print("Q22 First half reverse: ");
        for (int i = mid - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Q23: Second half reverse
        System.out.print("Q23 Second half reverse: ");
        for (int i = n - 1; i >= mid; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Q24: Even indexed elements
        System.out.print("Q24 Even indexed elements: ");
        for (int i = 0; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Q25: Even indexed elements reverse
        System.out.print("Q25 Even indexed reverse: ");
        for (int i = (n % 2 == 0 ? n - 2 : n - 1); i >= 0; i -= 2) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
