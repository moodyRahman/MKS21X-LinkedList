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
public boolean add(int val){
	if (start == null){
		start = new Node(val);
		size++;
		return true;
	}
	Node temp = start;
	while(temp.next != null){
		temp = temp.next;
	}
	temp.next = new Node(val);
	size++;
	return true;
}

public Node get(int index){
	Node temp = start;
	for(int i=0; i<index; i++){
		temp = temp.next;
	}
	return temp;
}

public String toString(){
	return "";
}

public static void main(String[] args) {

	MyLinkedList x = new MyLinkedList();
	ArrayList<Integer> test = new ArrayList<Integer>();
	x.add(44);
	x.add(234);
	x.add(4);
	System.out.println(x.get(0));
	System.out.println(x.size());
}

private class Node{

	private Integer data;
	private Node next,prev;

	public Node(Integer data){
		this.data = data;
	}

	public int get(){
		return this.data;
	}

	public void set(Integer val){
		this.data = val;
	}

	public String toString(){
		return data + "";
	}

}

}
