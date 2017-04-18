package org.coding.santosh;

public class Node {
int value;
Node next;

public Node(int v,Node n)
{
value = v;
next = n;
}

public Node()
{

}

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

public Node getNext() {
	return next;
}

public void setNext(Node next) {
	this.next = next;
}

}
