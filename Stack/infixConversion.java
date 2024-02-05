package Stack;
import java.util.*;
public class infixConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> opr = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                opr.push(ch);
            }else if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                post.push(ch + "");
                pre.push(ch + "");
            }else if(ch == ')'){
                while(opr.peek() != '('){
                    char op = opr.pop();
                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv1 + postv2 + op;
                    post.push(postv);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = op + prev1 + prev2 ;
                    pre.push(prev);
                }
                opr.pop();
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(opr.size() > 0 && opr.peek() != '('
                    && precedence(ch) <= precedence(opr.peek())
                ){
                    char op = opr.pop();
                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv1 + postv2 + op;
                    post.push(postv);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = op + prev1 + prev2 ;
                    pre.push(prev);
                }
                opr.push(ch);
            }
        }
        while(opr.size() > 0){
            char op = opr.pop();
            String postv2 = post.pop();
            String postv1 = post.pop();
            String postv = postv1 + postv2 + op;
            post.push(postv);

            String prev2 = pre.pop();
            String prev1 = pre.pop();
            String prev = op + prev1 + prev2 ;
            pre.push(prev);
        }
        System.err.println(post.pop());
        System.err.println(pre.pop());
    }
    public static int precedence( char op){
        if(op == '+' || op == '-'){
            return 1;
        }else if(op == '*' || op == '/'){
            return 2;
        }else return 0;
    }
}
