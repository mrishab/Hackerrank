import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		int result = makingAnagrams(s1, s2);
		System.out.println(result);
	}

	static int makingAnagrams(String s1, String s2) {
		int counter = 0;
		
		char[] listA = s1.toCharArray();
		char[] listB = s2.toCharArray();
		Arrays.sort(listA);
		Arrays.sort(listB);
		
		int aIndex = 0;
		int bIndex = 0;
		
		while((aIndex < listA.length) || (bIndex < listB.length)) {
			if((aIndex < listA.length) && (bIndex < listB.length)) {
				if (listA[aIndex] < listB[bIndex]) {
					aIndex++;
					counter++;
				}
				else if(listA[aIndex] > listB[bIndex]) {
					bIndex++;
					counter++;
				}
				else {
					aIndex++;
					bIndex++;
				}
			}
			
			else if(aIndex >= listA.length) {

				bIndex++;
				counter++;
			}
			else if(bIndex >= listB.length) {
				aIndex++;
				counter++;
			}
			else {
				aIndex++;
				bIndex++;
			}
		}
		return counter;
	}
}
