import java.util.Scanner;

public class Solution {
    
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] pos = new int[2];
        int [] dim = new int[2];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<2;i++) dim[i] = in.nextInt();
        String board[] = new String[dim[0]];
        for(int i=0;i<dim[0];i++) board[i] = in.next();
        next_move(pos[0], pos[1], board);
    }
    
    static void next_move(int posr, int posc, String[] board){
    	Integer[] target = new Integer[2];
    	
    	for(int i = 0; i < board.length; i++) {
    		for(int j = 0; j < board[i].length(); j++) {
    			
    			if(board[i].charAt(j) == 'd') {
    				if(target[0] == null) target[0] = i;
    				if(target[1] == null) target[1] = j;
    				
    				int curr_diff = (Math.abs(posr - target[0]) + Math.abs(posc - target[1]))/2;
    				int new_diff = (Math.abs(posr - i) + Math.abs(posc - j))/2;
    				
    				if(new_diff < curr_diff) {
    					target[0] = i;
    					target[1] = j;
    				}

    			}
    			
    		}
    	}
    	
    	if(target[0] != posr) {
    		if(target[0] > posr) {
    			System.out.println("DOWN"); 
    		}
    		else {
    			System.out.println("UP");
    		}
    	}
    	
    	else {
    		if(target[1] > posc) {
    			System.out.println("RIGHT");
    		}
    		else if (target[1] < posc) {
    			System.out.println("LEFT");
    		}
    		else
    			System.out.println("CLEAN");
    	}
    }
}
