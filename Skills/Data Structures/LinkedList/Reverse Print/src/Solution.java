public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Node{
		int data;
		Node next;
	}
	
	public static void ReversePrint(Node head){
		if (head == null)
			return;
		ReversePrint(head.next);
		System.out.println(head.data);
	}

}
