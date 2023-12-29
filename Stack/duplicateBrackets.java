 package Stack;
import java.util.*;
public class duplicateBrackets {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n.length(); i++){
            char ch = n.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println(true);
                    return;
                } else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}
