package com.bl.ds.stack_queue;

import com.bl.ds.linkedlist.INode;
import com.bl.ds.linkedlist.MyLinkedList;

public class MyStack {
	
	private MyLinkedList myLnkedList;

	public MyStack() {
		this.myLnkedList = new MyLinkedList();
	}

	public void push(INode myNode) {
		myLnkedList.add(myNode);
	}

	public void printStack() {
		myLnkedList.printMyNodes();
	}

	public INode peek() {
		return myLnkedList.head;
	}

	public INode pop() {
		return myLnkedList.pop();
	}

}
