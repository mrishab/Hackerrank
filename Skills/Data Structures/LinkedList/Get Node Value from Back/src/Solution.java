
public class Solution {
	public static void main(String[] args) {
		
	}
	
	public static class Node{
		int data;
		Node next;
	}
	
	public static int GetNode(Node head,int n){
		int counter = 0;
		Node fast = head;
		Node slow = head;
		
		while(fast.next!=null){
			fast = fast.next;
			
			if(counter >= n){
				slow = slow.next;
			}
			counter++;

		}
		return slow.data;
	}
}
