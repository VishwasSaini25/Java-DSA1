import java.util.*;

public class SpiralTraverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int minr = 0, minc = 0;
        int maxr = arr.length-1, maxc = arr[0].length-1;
        int totalEle = r * c;           //total elements
        int count = 0;
        while (count < totalEle) {      //until total elements get printed
            for (int j = minc, i = minr; i <= maxr && count < totalEle; i++) {      //left side
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            for (int j = minc, i = maxr; j <= maxc && count < totalEle; j++) {      //bottom side
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            for (int j = maxc, i = maxr; i >= minr && count < totalEle; i--) {      //rigth side
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            for (int j = maxc, i = minr; j >= minc && count < totalEle; j--) {      //top side
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
        sc.close();
    }
}
