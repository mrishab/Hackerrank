public class Solution {
	public static void main(String[] args) {
		
	}
	
	public static class Node{
		int data;
		Node next;
	}
	
	public static boolean hasCycle(Node head) {
		Node slow = head;
		Node fast = head;
		
		while ((slow != null) && (fast != null)){
			fast = fast.next;
			if((fast != null) && (slow == fast)){
				return true;
			}

			fast = fast.next;
			slow = slow.next;
		}
		return false;
	}
}