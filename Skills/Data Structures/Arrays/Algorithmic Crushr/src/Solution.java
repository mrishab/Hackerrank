import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		long M = scan.nextLong();
		
		long[] arr = new long[N];
		initArr(arr, N);
		
		performOperationsMTimes(M, arr, N, scan);
		System.out.println(findMax(arr, N));
		
	}
	
	public static void initArr(long[] arr, int arraySize){
		for (int i = 0; i < arraySize; i++){
			arr[i] = 0;
		}
	}
	
	private static void performOperation(long[] arr, int arraySize, Scanner scan){
		int a = (scan.nextInt())-1;
		int b = (scan.nextInt())-1;
		long k = scan.nextLong();
		
		for (int i = a; i <= b; i++){
            if((i >= arraySize) || (i < 0))
                break;
			arr[i] = arr[i] + k;
		}
	}
	
	public static void performOperationsMTimes(long mTimes, long[] arr, int arraySize, Scanner scan){
		for (int i = 0; i < mTimes; i++){
			performOperation(arr, arraySize, scan);
		}
	}
	
	public static long findMax(long[] arr, int arraySize){
		long high = arr[0];
		for (int i = 0; i < arraySize; i++){
			if(arr[i] > high){
				high = arr[i];
			}
		}
		return high;
	}
	
}
