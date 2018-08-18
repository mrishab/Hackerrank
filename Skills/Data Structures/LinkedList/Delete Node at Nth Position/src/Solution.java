
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Node{
		int data;
		Node next;
	}
	
	public static Node Delete(Node head, int position){
	    if(head == null){
	        return head;
	    }
	    
	    if(position == 0)
	        return head.next;
	    
	    Node temp = head;
	    for(int i = 0; i < (position-1); i++){
	        temp = temp.next;
	    }
	    
	    temp.next = temp.next.next;
	    
	    return head;
	}

}
