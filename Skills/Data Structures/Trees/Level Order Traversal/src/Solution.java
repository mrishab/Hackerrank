import java.util.ArrayList;

public class Solution {
	
	public static void main(String[] args) {
		
	}
	
	public static class Node{
		int data;
		Node left;
		Node right;
	}
	
	public static void levelOrder(Node root){
		ArrayList<Node> list = new ArrayList<>();
		list.add(root);
		
		while(!list.isEmpty()){
			Node temp = list.get(0);
			list.remove(0);
			
			if(temp.left != null){
				list.add(temp.left);
			}
			if(temp.right != null){
				list.add(temp.right);
			}
			
			System.out.print(temp.data + " ");
		}
	}
}