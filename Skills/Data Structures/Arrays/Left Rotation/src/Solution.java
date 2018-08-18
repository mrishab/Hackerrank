import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int d = scan.nextInt();
		
		int[] arr = null;
		arr = InitArray(arr, n, scan);
		
		for(int i = 0; i < d; i++){
			rotateLeft(arr, n);
		}
		
		printArr(arr, n);
		
		
	}
	
	public static int[] InitArray(int[] arr, int n, Scanner scan){
		arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	
	public static void rotateLeft(int[] arr, int arraySize){
		int temp = arr[0];
		for(int i = 0; i < (arraySize-1); i++){
			arr[i] = arr[i+1];
		}
		arr[arraySize-1] = temp;
	}
	
	public static void printArr(int[] arr, int arraySize){
		for (int i = 0; i< arraySize; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
