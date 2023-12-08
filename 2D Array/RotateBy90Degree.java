import java.util.*;
public class RotateBy90Degree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < arr.length; i++) {                  //input
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < arr.length; i++) {                  //columns becomes row
            for(int j = i;j < arr[0].length;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;    
            }
        }
        
        for (int i = 0; i < arr.length; i++) {                  //first column,last column swap.... first increase and last decrease at every loop
                 int minc = 0;
                 int maxc = arr[0].length-1;
                while(minc < maxc){
                    int temp = arr[i][minc];
                    arr[i][minc] = arr[i][maxc];
                    arr[i][maxc] = temp;
                    minc++;
                    maxc--;
                }
            }

        for (int i = 0; i < arr.length; i++) {                  //print
            for (int k = 0; k < arr[0].length; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
