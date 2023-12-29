package Stack;

import java.util.*;

public class balancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')') {
                boolean result = checkBalance(st, '(');
                if (!result) {
                    System.out.println(result);
                    return;
                }
            } else if (ch == '}') {
                boolean result = checkBalance(st, '{');
                if (!result) {
                    System.out.println(result);
                    return;
                }
            } else if (ch == ']') {
                boolean result = checkBalance(st, '[');
                if (!result) {
                    System.out.println(result);
                    return;
                }
            }
        }
        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean checkBalance(Stack<Character> st, char ch) {
        if (st.peek() != ch) {
            return false;
        } else if (st.size() == 0) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}