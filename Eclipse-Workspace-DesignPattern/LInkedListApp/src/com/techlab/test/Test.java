package com.techlab.test;

public class Test {
	public static void main(String[] args) {
		Node<String> n1 = new Node<String>("FIRST Node");
		Node<String> n2 = new Node<String>("SECOND Node");
		Node<String> n3 = new Node<String>("Third Node");
		
		n1.setNextNode(n2);
		n2.setNextNode(n3);
		
		display(n1);
	}

	private static void display(Node n1) {
		// TODO Auto-generated method stub
		Node node = n1;
		while(node.hasNextNode()) {
			System.out.println(node.getData());
			node= node.getNext();
		}
		System.out.println(node.getData());
		System.out.println();
		
	}
}
