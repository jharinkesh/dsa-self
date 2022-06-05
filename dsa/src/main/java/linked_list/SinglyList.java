package linked_list;

public class SinglyList {

	
	public static void main(String[] args) {
		SinglyList list = new SinglyList();
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.disp();
		list.removeFirst();
		list.disp();
		list.removeLast();
		list.disp();

	}
	
	Node head = null;
	
	void removeLast() {
		if(head == null || head.next == null)
			head= null;
		Node n1 = null, n2= head;
		while(n2.next!=null) {
			n1 = n2;
			n2 = n2.next;
		}
		n1.next = null;
	}
	
	void removeFirst() {
		this.head =head.next;
	}
	
	void add(int data) {
		if(head == null)
			head = new Node(data);
		else {
			Node n1 = new Node(data);
			Node n2 = head;
			while(n2.next!=null)
				n2= n2.next;
			n2.next = n1;
		}
	}
	
	
	void disp() {
		System.out.println();
		Node n1 =head;
		while(n1!=null) {
			System.out.print(n1.data +"->");
			n1 = n1.next;
		}
	}
	
	void dispR(Node n1) {
		if(n1!=null) {
			System.out.print(n1.data +"->");
			dispR(n1.next);
		}
	}
			
	
}


class Node {
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}