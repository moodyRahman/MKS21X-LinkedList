public class MyLinkedList{

private static int size;
private static Node start;
private static Node end;

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

public static Node find(int index){
	Node temp = start;
	for(int i=0; i<index; i++){
		temp = temp.nextNode();
	}
	return temp;
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
