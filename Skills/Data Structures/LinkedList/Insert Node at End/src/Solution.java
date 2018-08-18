public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Node{
		int data;
		Node next;
	}
	
	public static Node Insert(Node head, int data){
		if(head != null){
			
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			
			Node newNode = new Node();
			newNode.data = data;
			
			temp.next = newNode;
		}
		return head;
	}

}
