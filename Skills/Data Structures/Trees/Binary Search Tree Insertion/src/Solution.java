public class Solution {
	
	public static void main(String[] args) {
		
	}
	
	public static class Node{
		int data;
		Node left;
		Node right;
	}
	
	public static Node Insert(Node root, int value){
		if(root == null){
			root = new Node();
			root.data = value;
			return root;
		}
		
		Node temp = root;
		while(temp != null){
			if(value < temp.data){
				if(temp.left != null){
					temp = temp.left;
				}
				else{
					temp.left = new Node();
					temp.left.data = value;
					return root;
				}
			}
			else if(value > temp.data){
				if(temp.right != null){
					temp = temp.right;
				}
				else{
					temp.right = new Node();
					temp.right.data = value;
					return root;
				}
			}
		}
		return root;
	}

}