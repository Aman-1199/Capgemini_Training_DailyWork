public class BinaryCon {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        
        if (num == 0) {
            System.out.println("Binary: 0");
            return;
        }
        
        while (num > 0) {
            stack.push(num % 2);
            num = num / 2;
        }
        
        System.out.print("Binary: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
        scanner.close();
    }
}
