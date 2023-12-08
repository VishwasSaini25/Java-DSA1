import java.util.*;

public class MatrixMultiplication {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col]; // taking input for array1
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) { // arr[0].length for columns
                arr[i][j] = sc.nextInt();
            }
        }

        int row2 = sc.nextInt(); // taking input for array2
        int col2 = sc.nextInt();
        int[][] arr2 = new int[row2][col2];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] prd = new int[row][col2]; // multiplying above arrays
        for (int i = 0; i < prd.length; i++) {
            for (int j = 0; j < prd[0].length; j++) {
                for (int k = 0; k < col; k++) {
                    prd[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }

        for (int i = 0; i < prd.length; i++) {
            for (int j = 0; j < prd[0].length; j++) {
                System.out.print(prd[i][j] + " ");
            }
            System.out.println();
        }
    sc.close();
    }
}