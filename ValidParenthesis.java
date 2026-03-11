public class ValidParenthesis {
    public static boolean isValid(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));           
        System.out.println(isValid("()[]{}"));       
        System.out.println(isValid("([{}])"));       
        System.out.println(isValid("([)]"));         
        System.out.println(isValid("{[}"));          
        System.out.println(isValid(""));             
    }
}
