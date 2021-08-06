package com.techlab.test;

public class Node<E> {
	private E data;
	private Node next;

	public Node(E name) {
		this.data = name;
		this.next = null;
	}
	public void setNextNode(Node node) {
		this.next = node;
	}

	public boolean hasNextNode() {
		if(next!=null) {
			return true;
		}
		else
			return false;
	}
	public E getData() {
		return data;
	}
	public Node getNext() {
		return next;
	}

}
