public class Solution {
	public static void main(String[] args) {

	}

	public static class Node {
		int data;
		Node next;
		Node prev;
	}
	
	public static Node Reverse(Node head) {
		if(head == null){
			return head;
		}
		
		Node temp = head;
		
		while(temp.next != null){
			Node next = temp.next;
			
			temp.next = temp.prev;
			temp.prev = next;
			
			temp = next;
		}
		Node next = temp.next;
		
		temp.next = temp.prev;
		temp.prev = next;
		
		return temp;
	}

}
