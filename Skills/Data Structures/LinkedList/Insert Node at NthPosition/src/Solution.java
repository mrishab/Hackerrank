public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Node{
		int data;
		Node next;
	}
	
	public static Node InsertNth(Node head, int data, int position){
	    Node temp = new Node();
	    temp.data = data;
	    
	    if(head == null){
	        head = temp;
	        return head;
	    }
	    
	    if(position == 0){
	        temp.next = head;
	        head = temp;
	        return head;
	    }
	    
	    Node temp2 = head;
	    for(int i = 0; i < (position-1); i++){
	        temp2 = temp2.next;
	    }
	    
	    temp.next = temp2.next;
	    temp2.next = temp;

	    return head;
	}

}
