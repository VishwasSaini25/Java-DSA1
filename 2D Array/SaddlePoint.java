import java.util.*;

public class SaddlePoint {
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
        for(int i = 0; i < arr.length; i++){
            int saddlec = 0;
            for(int j = 1; j < arr[0].length; j++){
                if(arr[i][j] < arr[i][saddlec]){
                    saddlec = j;
                }
            }
            boolean flag = true;
            for(int k = 1;k < arr.length; k++){
                        if(arr[k][saddlec] > arr[i][saddlec]){
                            flag = false;
                            break;
                        }
                }
            if(flag == true){
                System.out.println(arr[i][saddlec]);
                return;
            }
        }
        System.out.println("Inavlid input");
        sc.close();
    }
}