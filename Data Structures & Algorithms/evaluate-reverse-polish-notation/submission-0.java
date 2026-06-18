class Solution {
    public int evalRPN(String[] tokens) {
        // 1. Fixed name, spelling, and removed 'private'
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            // 2. Fixed single quotes to double quotes
            if (token.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            } else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (token.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            } else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else {
                int number = Integer.parseInt(token);
                stack.push(number);
            }
        }

        // 3. Added the missing return statement
        return stack.pop();
    }
}