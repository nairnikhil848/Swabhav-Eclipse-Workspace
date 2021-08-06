package com.techlab.test;

import java.util.List;

import ExternalLibrary.QueueAdapter;

public class Test {
	public static void main(String[] args) {

		QueueAdapter list = new QueueAdapter();
		list.enqueue(4);
		list.enqueue(8);
		list.enqueue(12);

		printList(list.getList());
		System.out.println("Removed Integer from the List is :" + list.dequeue());
		printList(list.getList());
	}

	private static void printList(List list) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

	}
}
