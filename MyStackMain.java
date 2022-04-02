package com.bl.ds.stack_queue;

import com.bl.ds.linkedlist.INode;
import com.bl.ds.linkedlist.MyNode;

public class MyStackMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Stack & Queue Implementation Program with the help of Linked List");

		MyNode<Integer> node1 = new MyNode(70);
		MyNode<Integer> node2 = new MyNode(30);
		MyNode<Integer> node3 = new MyNode(56);

		MyStack myStack = new MyStack();
		System.out.println("Ceate Stack 56, 30, 70");
		myStack.push(node1);
		myStack.push(node2);
		myStack.push(node3);
		myStack.printStack();
		System.out.println("--------------------------------");
		System.out.println("Peek & Pop from the Stack");
		INode peek = myStack.peek();
		System.out.println(peek.getKey() + " is the Peek value of the Stack");
		INode pop = myStack.pop();
		System.out.println(pop.getKey() + " is removed in 1st Pop Operation");
		INode pop1 = myStack.pop();
		System.out.println(pop1.getKey() + " is removed in 2nd Pop Operation");
		myStack.printStack();
	}
}
