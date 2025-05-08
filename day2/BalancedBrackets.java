package day2;

import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i)=='[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            }
            else {
                if(st.isEmpty()) return "NO";

                char top = st.peek();

                if(s.charAt(i) == ')' && top == '(' ||
                        s.charAt(i) == ']' && top == '[' ||
                        s.charAt(i) =='}' && top == '{') {
                    st.pop();
                } else {
                    return "NO";
                }
            }
        }
        return st.isEmpty() ? "YES" : "NO";
    }
}

