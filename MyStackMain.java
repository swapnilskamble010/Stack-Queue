package com.bl.ds.stack_queue;

import com.bl.ds.linkedlist.MyNode;

public class MyStackMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Stack & Queue Implementation Program with the help of Linked List");
		
		MyNode<Integer> node1 = new MyNode(70);
		MyNode<Integer> node2 = new MyNode(30);
 		MyNode<Integer> node3 = new MyNode(56);
 		
 		MyStack myStack = new MyStack();
 		myStack.push(node1);
 		myStack.push(node2);
 		myStack.push(node3);
 		myStack.printStack();
	}
}
