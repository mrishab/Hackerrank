public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Node{
		int data;
		Node next;
	}
	
	public static int FindMergeNode(Node headA, Node headB) {
		Node tempA = headA;
		Node tempB = headB;
		
		while(tempA != null){
			while(tempB != null){
				if(tempA.data == tempB.data){
					return  tempA.data;
				}
				tempB = tempB.next;
			}
			tempB = headB;
			tempA = tempA.next;
		}
		return 0;
	}

}
