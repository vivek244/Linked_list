import java.util.LinkedList;

public class Reverse_group {
	static Node head;
	private static LinkedList ll;
	static class Node{
		int data; Node next;
		Node(int d){
			data=d;next=null;
		}
	}
	
	static Node reverse(Node nod,int k) {
		if(head==null)
			return null;
		Node curr=nod;
		Node prev=null;
		Node next=null;
		int count=0;
		while(count <k && curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		
		if(next!=null) 
			head.next=reverse(next,k);
		return prev;
	}
	
	static void print(Node node) {
		Node temp=head;
		while(temp!=null) {
		System.out.print(temp.data + " ");
		temp=temp.next;
	}
		System.out.println();
	}
	
	static void push(int data) {
		Node newn= new Node(data);
		newn.next=head;
		head=newn;
	}

	public static void main(String[] args) {
		ll = new LinkedList();
		push(40);
		push(21);
		push(32);
		push(14);
		push(23);
		push(96);
		push(45);
		push(25);
		push(110);
		push(10);
		
		System.out.println("Given Linked List is :");
		print(head);
		
		head=reverse(head,2);
		System.out.println("Reversed Linked list");
		print(head);

	}

}
