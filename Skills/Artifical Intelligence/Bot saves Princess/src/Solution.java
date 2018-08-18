import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = scan.nextInt();
		int c = scan.nextInt();
		Location p = null;
		char[][] grid = new char[n][n];
		
		for(int i =0; i < n; i++) {
			String temp = scan.next();
			for(int j =0; j < n; j++) {
				grid[i][j] = temp.charAt(j);		
			}
		}
		
		System.out.println(nextMove(n,r,c,grid));
		
	}
	
	public static class Location{
		int x,y;
		
		Location(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static String nextMove(int n, int r, int c, char[][]grid){
		Location b = new Location(r,c);
		Location p = null;
		for(int i =0; i < n; i++) {
			for(int j =0; j < n; j++) {
				if (grid[i][j] == 'p') {
					p = new Location(i, j);
				}
			}
		}
		
		
		if(p.x != b.x) {
			if(p.x > b.x)
				return "DOWN";
			else
				return "UP";
		}
		
		else {
			if(p.y > b.y)
				return "RIGHT";
			else if(p.y == b.y)
				return "";
			else
				return "LEFT";
		}
	}
}