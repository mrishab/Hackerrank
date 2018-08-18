public class Solution {
	
	public static void main(String[] args) {
		
	}
	
	public static class Node{
		int data;
		Node left;
		Node right;
	}
	
	public static int height(Node root){
        if(root!=null){
            int ltH = height(root.left);
            int rtH = height(root.right);
            
            if(ltH>rtH)
                return ++ltH;
            else
                return ++rtH;
        }
        return -1;
	}
}