public class Solution {
	public static void main(String[] args) {

	}

	public static class Node {
		int data;
		Node next;
		Node prev;
	}

	public static Node SortedInsert(Node head, int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (head == null) {
			head = newNode;
			return head;
		}

		Node temp = head;

		while ((temp.next != null) && temp.next.data < data) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next = newNode;

		return head;
	}

}
