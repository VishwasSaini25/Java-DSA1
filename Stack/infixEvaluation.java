package Stack;
import java.util.*;
public class infixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        Stack<Integer> opnd = new Stack<>();
        Stack<Character> opr = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                opr.push(ch);
            }else if(Character.isDigit(ch)){
                opnd.push(ch - '0');
            }else if(ch == ')'){
                while(opr.peek() != '('){
                    char operator = opr.pop();
                    int v2 = opnd.pop();
                    int v1 = opnd.pop();
                    int opv = operations(v1, v2, operator);
                    opnd.push(opv);
                }
                opr.pop();
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(opr.size() > 0 && opr.peek() != '(' && precedence(ch) <= precedence(opr.peek())){
                    char operator = opr.pop();
                    int v2 = opnd.pop();
                    int v1 = opnd.pop();
                    int opv = operations(v1, v2, operator);
                    opnd.push(opv);
                }
                opr.push(ch);
            }
        }
        while(opr.size() !=0 ){
            char operator = opr.pop();
            int v2 = opnd.pop();
            int v1 = opnd.pop();
            int opv = operations(v1, v2, operator);
            opnd.push(opv);
        }
        System.out.println(opnd.peek());
    }
    public static int precedence(char op){
        if(op == '+') return 1;
        else if(op == '-') return 1;
        else if(op == '*') return 2;
        else if(op == '/') return 2;
        else return 0;
    }
    public static int operations(int v1, int v2, char op){
        if(op == '+') return v1 + v2;
        else if(op == '-') return v1 - v2;
        else if(op == '*') return v1 * v2;
        else if(op == '/') return v1 / v2;
        else return 0;
    }
}
