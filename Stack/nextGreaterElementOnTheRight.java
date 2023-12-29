package Stack;
import java.util.*;
public class nextGreaterElementOnTheRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Stack<Integer> st = new Stack<>();
        int [] result = new int[n];
        st.push(arr[n-1]);
        result[n-1] = -1;
        for(int i = n-2; i >=0; i--){
          
        }
    }
}
