import java.util.*;

public class ExitPointOfMatrix {
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

        int i = 0, j = 0, dir = 0;
        while (true) {
            dir = (dir + arr[i][j]) % 4; // will give us direction
            if (dir == 0) { // east direction
                j++;
            } else if (dir == 1) { // south direction
                i++;
            } else if (dir == 2) { // west direction
                j--;
            } else if (dir == 3) { // north direction
                i--;
            }

            if (j == col) {
                j--;
                break;
            } else if (i == row) {
                i--;
                break;
            } else if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            }
        }
        System.out.println(i + " " + j);
        sc.close();
    }

}