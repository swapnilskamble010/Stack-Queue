package com.bl.ds.stack_queue;

import com.bl.ds.linkedlist.INode;
import com.bl.ds.linkedlist.MyNode;

public class MyQueueMain {

	public static void main(String[] args) {
		MyNode<Integer> node1 = new MyNode(56);
		MyNode<Integer> node2 = new MyNode(30);
		MyNode<Integer> node3 = new MyNode(70);
		
		MyQueue myQueue = new MyQueue();
		System.out.println("Create a Queue of 56->30->70");
		myQueue.append(node1);
		myQueue.append(node2);
		myQueue.append(node3);
		myQueue.printQueue();
		System.out.println("----------------------------------");
		System.out.println("Dequeue from the beginning");
		INode p1 = myQueue.pop();
		System.out.println(p1.getKey() + " is removed in 1st pop operation");
		INode p2 = myQueue.pop();
		System.out.println(p2.getKey() + " is removed in 2nd pop operation");
		myQueue.printQueue();
		System.out.println("----------------------------------");
	}
}
