package Recursion;
import java.util.*;
public class printIncreasing {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecrease(n);
        sc.close();
   }

   public static void printDecrease(int n){
       if(n == 0){
           return;
       }
       printDecrease(n-1);
       System.out.println(n);
   }
}
