import java.util.LinkedList;


public class Remove_duplicates {
	
	static Node head;
	static class Node{
		int data;Node next;
		Node(int d){
			data=d;next=null;
		}
	}
	
    static void remove() {
        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;
 
        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
 
            /* Compare the picked element with rest
                of the elements */
            while (ptr2.next != null) {
 
                /* If duplicate then delete it */
                if (ptr1.data == ptr2.next.data) {
 
                    /* sequence of steps is important here */
                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                    System.gc();
                } else /* This is tricky */ {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll=new LinkedList();
		head=new Node(11);
		head.next=new Node(11);
		head.next.next=new Node(15);
		head.next.next.next=new Node(41);
		head.next.next.next.next=new Node(19);
		push(21);
		
		remove();
		print(head);
		

	}

}
