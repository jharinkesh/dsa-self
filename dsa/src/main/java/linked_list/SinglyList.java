package linked_list;

public class SinglyList {

	
	public static void main(String[] args) {
		SinglyList list = new SinglyList();
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(11);

		list.disp();
//		list.removeFirst();
//		list.removeLast();
		
//		System.out.println(list.searchR(list.head, 6, 1));
		list.insertPosition(10,4);
		list.disp();

	}
	
	void insertPosition(int data, int p) {
		Node n1 = head;
		int count = 1;
		while(n1!=null) {
			if(count == p-1) {
				Node n2 = new Node(data);
				n2.next = n1.next;
				n1.next = n2;
				return;
			}
			n1 = n1.next;
			count++;
		}
	}
	
	int search(int k) {
		int count =1;
		Node n1 = head;
		if(n1==null)
			return -1;
		while(n1!=null) {
			if(n1.data == k)
				return count;
			n1 = n1.next;
			count++;
		}
		return -1;
	}
	
	int searchR(Node n1,int k, int i) {
		if(n1!=null) {
			if(n1.data == k)
				return i;
			return searchR(n1.next, k, i+1);
		}
		return -1;
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