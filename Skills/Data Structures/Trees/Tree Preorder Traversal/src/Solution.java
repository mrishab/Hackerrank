
public class Solution {
	
	public static void main(String[] args) {
		
	}
	
	public static class Node{
		int data;
		Node left;
		Node right;
	}
	
	public static void preOrder(Node root){
		if(root != null){
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
}
