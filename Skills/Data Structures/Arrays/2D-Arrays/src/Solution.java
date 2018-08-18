import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
        System.out.println(findMaxSum(arr));
    }
    
    public static int findHourGlassSum(int arr[][], int a, int b){
        int sum = 0;
        for(int i = a; i < (a+3); i++){
            for(int j = b; j < (b+3); j++){
                if((i == (a+1)) && (j != (b+1)))
                    continue;
                sum += arr[i][j];
            }
        }
        return sum;
    }
    
    public static int findMaxSum(int arr[][]){
        int max = -99999;
        for(int i = 0; i < (arr.length-2); i++){
            for(int j = 0; j <(arr[i].length-2); j++){
                int sum = findHourGlassSum(arr, i, j);
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
}
