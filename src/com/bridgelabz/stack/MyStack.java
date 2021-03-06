package com.bridgelabz.stack;

public class MyStack {
	private final MyLinkedList myLinkedList;

	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	public void push(INode newNode) {
		myLinkedList.add(newNode);
	}
	public void printStack() {
		myLinkedList.printMyNodes();
	}
	public Integer peak() {
		return (Integer)myLinkedList.head.getKey();
	}
	public INode pop() {
		return myLinkedList.popLast();
	}
	public int size() {
		return myLinkedList.size();
	}
	public void isEmpty() {
		myLinkedList.isEmpty();
	}
}