package com.bl.ds.stack_queue;

import com.bl.ds.linkedlist.INode;
import com.bl.ds.linkedlist.MyLinkedList;

public class MyQueue {
	
	private MyLinkedList myLnkedList;
	
	public MyQueue() {
		this.myLnkedList = new MyLinkedList();
	}
	
	public void append(INode myNode) {
		myLnkedList.append(myNode);
	}
	
	public void printQueue() {
		myLnkedList.printMyNodes();
	}

}
