import java.util.ArrayList;
public class MyLinkedList{

private int size = 0;
private Node start = new Node(null);
private Node end = new Node(null);

public MyLinkedList(){
	start.next = end;
	end.prev = start;
}

public int size(){
	return size;
}
public boolean add(Integer val){
	Node toAdd = new Node(val);
	Node oldLast = end.prev;
	oldLast.next = toAdd;
	toAdd.prev = oldLast;
	toAdd.next = end;
	end.prev = toAdd;
	size++;
	return true;
}

private Node findNode(int index){
	Node temp = start;
	for (int x = 0; x < index + 1; x++){
		temp = temp.next;
	}
	return temp;
}

public boolean add(int index, Integer val){
	Node toAdd = new Node(val);
	Node temp = findNode(index);
	temp.prev.next = toAdd;
	toAdd.prev = temp.prev;
	toAdd.next = temp;
	temp.prev = toAdd;
	return true;
}

public Integer set(int index, Integer val){
	Node temp = findNode(index);
	int out = temp.data;
	temp.data = val;
	return out;
}

public Integer get(int index){
	return findNode(index).data;
}

public String toString(){
	String output = " ";
	Node temp = start.next;
		while(temp != null && temp != end){
			output += temp.data;
			output += ", ";
			temp = temp.next;
		}
	return output;
}

public static void main(String[] args) {

	MyLinkedList x = new MyLinkedList();
	ArrayList<Integer> test = new ArrayList<Integer>();
	x.add(44);
	x.add(4);
	x.add(6);
	x.add(55);
	System.out.println(x);
	x.add(2, 8);
	System.out.println(x);
	x.set(2, 7);
	System.out.println(x);

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
