public class Solution {
	public static void main(String[] args) {
		
	}
	
	public static class Node{
		int data;
		Node next;
	}
	
	public static Node RemoveDuplicates(Node head) {
		Node temp = head;
		
		while((temp != null) && (temp.next!=null)){
			Node next = temp.next;
			while((next.next != null) && (next.data == temp.data)){
				next = next.next;
			}
			temp.next = next;
			temp = temp.next;
		}
		return head;
	}
}