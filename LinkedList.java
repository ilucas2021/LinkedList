/* Linked List
 * Fall 2020
 * Starter 
 */

import java.util.*;

public class LinkedList<T> {
    // not actually implementing List because of the number of fiddly
    // methods required - Spliterators and Iterators specifically
    // this will implement everything in a List except those

    // instance variables
    private Node<T> head;
    private int size;

    //Constructors
    public LinkedList(){
	head = new Node<T>(); //null
	size = 0;
    }

    // methods
    public int getSize() { return size; } //done
    public boolean isEmpty() { return size == 0; }
    public void clear() {
	head = null;
	size = 0;
    }
    
    public boolean contains(T element) {
	return find(element) >= 0;
    }
    //FOR HOMEWORK - add (append) - cases: size = 0, size != 03
    public void add(T element) {
	    Node<T> curr = head;
	    Node<T> newElt = new Node<T> (element);
	    if (size == 0) { head = newElt; size++; return;}
	    while (curr.getNext() != null) {curr = curr. getNext();}
	    curr.setNext(newElt);
	    size++;
	    return;
    } //append
    public void add(int index, T element) {
	    assert(index <= size);
	    Node<T> curr = head;
	    Node<T> newElt = new Node<T> (element);
	    if (index = 0) {
		    newElt.setNext(head);
		    head = newElt;
		    size++;
	    }
	    for (int i = -; i <index -1; i++) { curr = curr.getNext()}
	    newElt.setNext(curr.getNext());
	    curr.setNext(newElt);
	    size++;
	    return;
    }
    public boolean remove(T element) { return false; }
    public int find(T element) {
	Node<T> curr = head;
	int pos = 0;
	while (curr != null && curr.getElement() != element){
	    curr = curr.getNext();
	    pos++;
	}
	if (curr == null) return -1;
	return pos;
    }
    public T get(int index) {
	Node<T> curr = head;
	for (int i = 0; i < index; i++){
	    curr = curr.getNext();
	}
	return curr.getElement();
    }
    public T set(int index, T newVal) { return null; }
    public void remove(int index) {};
    private void print() {
	Node<T> curr = head;
	while (curr.getNext() != null){ 
	    System.out.println(curr.getElement());
	    curr = curr.getNext();
	}
	System.out.println(curr.getElement());
    }

}



	 
    
    
    

    
    
    
