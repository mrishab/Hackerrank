import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Node root = new Node();
		root.data = 1;
		root = makeTree(root, scan);
		swapAll(root, scan);
		scan.close();
	}
	
	public static class Node{
		long data;
		Node left;
		Node right;
	}
	
	public static Node makeTree(Node root, Scanner scan){
		
		if(root == null){
			root = new Node();
			root.data = 1;
			return root;
		}
		
		ArrayList<Node> list = new ArrayList<>();
		long n = scan.nextLong();
		
		list.add(root);

		for(long i = 0; i < n; i++){

			Node iterate = list.get(0);
			list.remove(0);
			
			long a = scan.nextLong();
			long b = scan.nextLong();
			
			if(a != -1){
				Node temp = new Node();
				temp.data = a;
				iterate.left = temp;
				list.add(iterate.left);
			}
			
			if(b != -1){
				Node temp = new Node();
				temp.data = b;
				iterate.right = temp;
				list.add(iterate.right);
			}
		}
		return root;
	}
	
	public static long height(Node root){
		if(root != null){
			long lt = height(root.left);
			long rt = height(root.right);
			
			if(lt>rt){
				return ++lt;
			}
			else{
				return ++rt;
			}
		}
		
		else{
			return 0;
		}
	}
	
	public static Node swap(Node root){
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		return root;
	}
	
	public static void swapAll(Node root, Scanner scan){
		long height = height(root);
		long t = scan.nextLong();
		
		for (long i = 0; i < t; i++){
			long h = scan.nextLong();

			for(long j = h; j <= height; j+=j){
				root = swapAtHeight(root, j, 1);
			}
			inOrder(root);
			System.out.println("");

		}
	}
	
	public static Node swapAtHeight(Node root, long height, long level){
		if(root != null){
			if(height == level){
				root = swap(root);
				return root;
			}
			
			root.left = swapAtHeight(root.left, height, level+1);
			root.right = swapAtHeight(root.right, height, level+1);
			
		}
		return root;
	}
	
	public static void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
}
