import java.util.*;

public class DiagonalTraversal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        int i,minc=0,j,maxr = arr.length;
        while(count < row){
            j = minc; i = 0;
            while(i < maxr || j < arr.length){
                System.out.print(arr[i][j] + " ");
                i++;
                j++;
            }
            minc++;
            maxr--;
            count++;
        }
        sc.close();
    }
}