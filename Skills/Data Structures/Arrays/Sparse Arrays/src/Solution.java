import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String[] list = new String[N];
		getStrings(list, N, scan);
		
		int Q = scan.nextInt();
		performQueryQTimes(Q, scan, list);
	}
	
	public static void getStrings(String[] list, int arraySize, Scanner scan){
		for(int i = 0; i < arraySize; i++){
			list[i] = scan.next();
		}
	}
	
	public static void performQuery(String[] list, int arraySize, String queryString){
		int occurences = 0;
		
		for(int i = 0; i < arraySize; i++){
			if(list[i].equals(queryString))
				occurences++;
		}
		
		System.out.println(occurences);
	}
	
	public static void performQueryQTimes(int QTimes, Scanner scan, String[] list){
		for(int i = 0; i < QTimes; i++){
			String queryString = scan.next();
			performQuery(list, list.length, queryString);
		}
	}
}
