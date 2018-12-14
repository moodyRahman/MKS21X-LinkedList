import java.util.ArrayList;
public class MyLinkedList{

private int size;
private Node start;
private Node end;

public MyLinkedList(){
}

public int size(){
	return size;
}
public void add(int val){
	if (start == null){
		start = new Node(val);
		size++;
	}
	else {
		Node temp = start;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = new Node(val);
		size++;	
	}
}

public Node get(int index){
	Node temp = start;
	for(int i=0; i < index; i++){
		temp = temp.next;
	}
	return temp;
}

public String toString(){
	String output = "";
	Node temp = start;
	for(int i=0; i < size; i++){
		output += temp.get() + ", ";
		temp = temp.next;
	}
	return output;
}

public static void main(String[] args) {

	MyLinkedList x = new MyLinkedList();
	ArrayList<Integer> test = new ArrayList<Integer>();
	x.add(44);
	test.add(44);
	x.add(234);
	test.add(234);
	x.add(4);
	test.add(4);
	System.out.println(x);
	System.out.println(test);
}

private class Node{

	private Integer data;
	private Node next,prev;

	private Node(Integer data){
		this.data = data;
	}

	private int get(){
		return this.data;
	}

	private void set(Integer val){
		this.data = val;
	}

	public String toString(){
		return data + "";
	}

}

}
