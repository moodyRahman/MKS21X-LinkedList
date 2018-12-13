public class MyLinkedList{

private static int size;
private static Node start;
private static Node end;

public MyLinkedList(int inp){
	start = new Node(inp);
	size++;
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

public Node find(int index){
	Node temp = start;
	for(int i=0; i<index; i++){
		temp = temp.nextNode();
	}
	return temp;
}

public String toString(){
	return "";
}

public static void main(String[] args) {
	MyLinkedList x = new MyLinkedList(5);
	x.add(4);
	x.add(999);
	x.add(6);
	x.find(1).set(100);
	// System.out.println(x.size());
	System.out.println(x.find(2).get());
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

public void set(int val){
	this.data = val;
}

public Node nextNode(){
	return next;
}

public void setNextNode(Node inp){
	this.next = inp;
}

}
