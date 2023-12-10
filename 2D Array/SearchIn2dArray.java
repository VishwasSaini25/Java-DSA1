import java.util.*;
public class SearchIn2dArray {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);        //input
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int search = sc.nextInt();
        int i = 0;
        int j = arr[0].length-1;
        boolean found = false;
        while(i < arr.length && j >=0){             //search
            if(arr[i][j] == search){
                found = true;
                System.out.println(arr[i][j]);
                break;
            } else if(arr[i][j] < search){
                i++;
            } else if(arr[i][j] > search){
                j--;
            }
        }
        if(!found){
            System.out.println("not found");
        }
    }
}
