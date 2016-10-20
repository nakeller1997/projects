import java.util.*;
public class TestLinkedList{
	public static void main(String[] args){
		LinkedList<Integer> il = new LinkedList<>();
		il.add(5);
		il.add(19);
		il.add(26);
		il.add(1,35);
		System.out.println(il);
		System.out.println(il.remove());
		System.out.println(il);
		}
	public void add(T e){
		Node<T> n = new Node<>(e);
		if(head == null){ //empty list
			head = n;
		}
		else{
			
	}
}
public class Node<T>{
	T element;
	Node<T> next;
	public Node(T e){
		element = e;
	}
}