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
	return false;
}
public String toString(){
	return "";
}
}

class Node{

private int data;
private Node next,prev;

public Node(int data){
	this.data = data;
}

public int get(){
	return this.data;
}

}
