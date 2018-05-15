package chap1.recursion;

public class LinkedListTraversalHeadVsTailRecursion {

	static class Node {
		
		int data;
		Node next;
		
		public Node(Node next, int data) {
			this.next = next;
			this.data = data;
		}
	}
	
	Node node;
	
	public LinkedListTraversalHeadVsTailRecursion( Node node) {
		this.node = node;
	}
	
	public static void tailRecursion(Node node) {
		if(node == null) return;
		
		if(node != null) {
			System.out.print(node.data + "\t");
			tailRecursion(node.next);
		}
	}
	
	public static void headRecursion(Node node) {
		if(node == null) return;
		
		if(node != null) {
			headRecursion(node.next);
			System.out.print(node.data + "\t");
		}
	}
	
	public static void main(String[] args) {
		Node fourth = new Node(null,4);
		Node third = new Node(fourth, 3);
		Node second = new Node(third,2);
		Node head = new Node(second, 1);
		
		//headRecursion(head);//4	3	2	1
		tailRecursion(head);//1	2	3	4
		//traverseList(head);
	}
	
	public static void traverseList(Node node) {
		while(node != null) {
			System.out.print(node.data + "\t");
			node = node.next;
		}
	}
}