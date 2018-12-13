public class MyLinkedList{

private int size;
private Node start;
private Node end;

public MyLinkedList(int inp){
	start = new Node(inp);
}

public int size(){
	return size;
}
public boolean add(int value){
	Node temp = start;
	while(temp.nextNode() != null){
		temp = temp.nextNode();
	}
	temp.setNextNode(new Node(value));
	size++;
	return true;
}
public String toString(){
	return "";
}
}



// ┌┐┌┌─┐┌┬┐┌─┐
// ││││ │ ││├┤
// ┘└┘└─┘─┴┘└─┘
class Node{

private int data;
private Node next,prev;

public Node(int data){
	this.data = data;
}

public int get(){
	return this.data;
}

public Node nextNode(){
	return next;
}

public void setNextNode(Node inp){
	this.next = inp;
}

}
