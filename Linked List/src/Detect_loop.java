import java.util.HashSet;
import java.util.LinkedList;


public class Detect_loop {
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int d){
			data=d;next=null;
		}
	}
	
	static public void push(int data) {
		Node temp=new Node(data);
		temp.next=head;
		head=temp;
	}
	
	static void print(Node node) {
		Node temp=head;
		while(temp!=null) {
		System.out.print(temp.data + " ");
		temp=temp.next;
	}
		System.out.println();
	}
	
	static boolean detect(Node n) {
		HashSet<Node> s=new HashSet<Node>();
		while(n !=null) {
			if(s.contains(n)) return true;
			s.add(n);
			n=n.next;
		}	
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		push(40);
		push(21);
		push(32);
		push(14);
		push(23);
//		push(40);
		System.out.println("Given Linked List is :");
		print(head);
		head.next.next.next.next = head;
		if (detect(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
//		head= detect(head);

	}

}
