import java.util.ArrayList;
public class MyLinkedList{

private int size = 0;
private Node start = new Node(null);
private Node end = new Node(null);

public MyLinkedList(){
	start.next = end; //linking start and ends
	end.prev = start;
}

public int size(){
	return size;
}

private Node getStart(){
	return start;
}

private Node getEnd(){
	return end;
}

public void extend(MyLinkedList other){
	this.end.prev.next = other.start.next;
	other.start.next.prev = this.end.prev;
	this.end = other.end;
	this.size = this.size + other.size();
}

public boolean add(Integer val){
	//make some new node and link the oldLast to new
	//and new to end
	//repeat for prev nodes
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

private void ipch(int val){
	if (val < 0 || val >= size){
		throw new IndexOutOfBoundsException();
	}
}

public void add(int index, Integer val){
	if (index < 0 || index > size){
		throw new IndexOutOfBoundsException();
	}
	Node toAdd = new Node(val);
	Node temp = findNode(index);
	temp.prev.next = toAdd;
	toAdd.prev = temp.prev;
	toAdd.next = temp;
	temp.prev = toAdd;
	size++;
}

public Integer set(int index, Integer val){
	ipch(index);
	Node temp = findNode(index);
	int out = temp.data;
	temp.data = val;
	return out;
}

public Integer get(int index){
	ipch(index);
	return findNode(index).data;
}

public boolean contains(Integer val){
	Node temp = start.next;
	while(temp != null && temp != end){
		if (temp.data.equals(val)){
			return true;
		}
		temp = temp.next;
	}
	return false;
}

public int indexOf(Integer val){
	int counter = 0;
	Node temp = start.next;
	while(temp != null && temp != end){
		if (temp.data.equals(val)){
			return counter;
		}
		temp = temp.next;
		counter++;
	}
	return -1;
}

public Integer remove(int index){
	ipch(index);
	Node toRemove = findNode(index);
	toRemove.prev.next = toRemove.next;
	toRemove.next.prev = toRemove.prev;
	size--;
	return toRemove.data;
}

public boolean remove(Integer val){
	Node temp = start.next;
	while(temp != null && temp != end){
		if (temp.data.equals(val)){
			Node toRemove = temp;
			toRemove.prev.next = toRemove.next;
			toRemove.next.prev = toRemove.prev;
			size--;
			return true;
		}
		temp = temp.next;
	}
	return false;
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

public String toStringRev(){
	String output = " ";
	Node temp = end.prev;
		while(temp != null && temp != start){
			output += temp.data;
			output += ", ";
			temp = temp.prev;
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
	System.out.println(x.size());
	System.out.println(x);
	x.set(2, 7);
	System.out.println(x);
	System.out.println(x.contains(8));
	// System.out.println(x.IndexOf(5555));
	x.remove(x.indexOf(6));
	System.out.println(x);
	x.add(44);
	x.add(78);
	System.out.println(x);
	System.out.println(x.remove(new Integer(55)));
	System.out.println(x);
	System.out.println(x.toStringRev());
	System.out.println("#######");
	MyLinkedList z = new MyLinkedList();
	z.add(6);
	z.add(5);
	System.out.println(x);
	System.out.println(z);
	x.extend(z);
	System.out.println(x);
	System.out.println(x.toStringRev());

}


private class Node{

	private Integer data;
	private Node next,prev;

	private Node(Integer data){
		this.data = data;
	}

	public String toString(){
		return data + "";
	}

}

}
