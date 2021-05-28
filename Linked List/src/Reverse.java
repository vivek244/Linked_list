import java.util.LinkedList;

public class Reverse {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;next=null;
		}
	}
	
	static Node reverse(Node nod) {
		Node prev=null;
		Node curr= nod;
		Node next=null;
		while(curr!= null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		nod=prev;
		return nod;	
	}
	
	static void print(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node=node.next;
		}
		System.out.println();
	}
	
	 static void push(int data)
	    {
	        Node temp = new Node(data);
	        temp.next = head;
	        head = temp;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        LinkedList list = new LinkedList();
        push(20);
        push(41);
        push(15);
        push(36);
        push(40);
        
        System.out.println("Given linked list");
        print(head);
        head = reverse(head);
        
        System.out.println("Reversed Linked list");
        print(head);
	
	}

}
