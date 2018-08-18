import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int k = in.nextInt();

		String grid[] = new String[x];

		for(int i = 0; i < x; i++) {
			grid[i] = in.next();
		}

		nextMove(x, y, k, grid);
		
	}

	public static void nextMove(int x, int y, int k, String[] grid) {
		int max = 0;
		int targetX = 0, targetY = 0;
		
		for(int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				Integer counter = 0;

				ArrayList<Integer> listX = new ArrayList<>();
				ArrayList<Integer> listY = new ArrayList<>();
				
				listX.add(i);
				listY.add(j);
				int a = 0;
				
				while(a < listX.size()) {
					int m = listX.get(a);
					int n = listY.get(a);

					counter = addIfAdj(grid, m, n, 0, 1, listX, listY, counter);
					counter = addIfAdj(grid, m, n, 0, -1, listX, listY, counter);
					counter = addIfAdj(grid, m, n, 1, 0, listX, listY, counter);
					counter = addIfAdj(grid, m, n, -1, 0, listX, listY, counter);
					a++;

				}
				if(counter > max) {
					max = counter;
					targetX = i;
					targetY = j;
				}
			}
		}
		System.out.println(targetX + " " + targetY);
	}
	
	private static int addIfAdj(String[] board, int LocX, int LocY, int IncX, int IncY, ArrayList<Integer> listX, ArrayList<Integer> listY, Integer counter) {
		int targetX = LocX + IncX;
		int targetY = LocY + IncY;

		if((targetX < 0) || (targetY < 0) || (targetX >= board.length) || (targetY >= board[targetX].length()) || (listX.contains(targetX) && listY.contains(targetY))) return counter;

		if((board[targetX].charAt(targetY) == board[LocX].charAt(LocY)) && board[LocX].charAt(LocY) != '-') {
	
			listX.add(targetX);
			listY.add(targetY);
			counter++;
		}
		return counter;
	}
	
	public static void printList(ArrayList<Integer> list){
		for(int x: list) {
			System.out.println(x);
		}
	}
}
