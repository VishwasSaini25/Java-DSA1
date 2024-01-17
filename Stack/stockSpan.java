package Stack;

import java.util.*;

public class stockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        System.out.println("span for " + arr[0] + " 1");
        for (int i = 1; i < n; i++) {
            if (arr[i] < st.peek()) {
                st.push(arr[i]);
                System.out.println("span for " + arr[i] + " 1");
            } else {
                boolean flag = true;
                while (flag) {
                    if (st.empty()) {
                        st.push(arr[i]);
                        System.out.println("span for " + arr[i] + " " + (i + 1));
                        flag = false;
                    } else if (st.peek() > arr[i]) {
                        for (int k = i - 1; k >= 0; k--) {
                            if (arr[k] > arr[i]) {
                                System.out.println("span for " + arr[i] + " " + (i - k));
                                break;
                            }
                        }
                        st.push(arr[i]);
                        flag = false;
                    } else if (st.peek() < arr[i]) {
                        st.pop();
                    }
                }
            }
        }
    }
}
