package linkedList;

public class RevLinkedListIterative {

	static Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			
			data =d;
			next =null;
			
		}
		
	}
	
	
	Node reverse(Node head) {
		
		Node current = head;
		Node prev = null;
		Node next = null;
		
		
		while(current!=null) {

			next = current.next;
			current.next = prev;
			prev=current;
			current=next;
           
		}
		
		head =prev;
		return head;
	}
	
	
	void printList(Node node) {
		
		while(node!=null) {
			
			System.out.print(node.data+ " ");
			node=node.next;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		RevLinkedListIterative list = new RevLinkedListIterative();
		list.head = new Node(108);
		list.head.next=new Node(32);
		list.head.next.next = new Node(39);
		list.head.next.next.next = new Node(94);
		
		System.out.println("Given LinkedList:");
		list.printList(head);
		System.out.println("\nReversed LinkedList:");
		head = list.reverse(head);
		list.printList(head);


		
		
	}

}
