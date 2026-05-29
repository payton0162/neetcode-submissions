class Solution {
    public boolean isValid(String s) {
        Stack<Character> w = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                w.push(')');
            } else if (c == '[') {
                 w.push(']');
            } else if (c == '{') {
                 w.push('}');
            } else { 
                if (w.isEmpty() || w.pop() != c) {
                    return false; 
                }
            } 
        }
        return w.isEmpty();
    }
}