import java.util.ArrayList;
public class MyLinkedList{

private int size;
private Node start;
private Node end;

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
	ArrayList<Integer> test = new ArrayList<Integer>();
	test.add(5);  //header
	x.add(4);
	test.add(4);
	// System.out.println(x.find(1).get());
	x.add(999);
	test.add(999);

	x.add(6);
	test.add(6);

	x.find(1).set(100);
	test.set(1, 100);
	// System.out.println(x.size());
	System.out.println(x.find(0).get());
	System.out.println(x.find(1).get());
	System.out.println(x.find(2).get());
	System.out.println(x.find(3).get());
	System.out.println(test);
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
