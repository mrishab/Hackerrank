public class Solution {
	
	public static void main(String[] args) {
		
	}
	
	public static class Node{
		int data;
		Node left;
		Node right;
	}
	
	public static Node lca(Node root,int v1,int v2){
		Node temp = root;
		while(temp != null){
			if((v1 < temp.data) && (v2 < temp.data)){
				temp = temp.left;
			}
			else if((v1 > temp.data) && (v2 > temp.data)){
				temp = temp.right;
			}
			else{
				break;
			}
		}
		return temp;
	}


}