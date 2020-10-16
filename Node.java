/* Node 
 * Fall 2020
 * DSA
 * Full
 */

import java.util.*;

public class Node<T>{

    private T element;
    private Node<T> next;

    public Node(){
	element = null;
	next = null;
    }
    public Node(T elt){
	element = elt;
	next = null;
    }
    public Node(T elt, Node<T> n){
	element = elt;
	next = n;
    }

    public T getElement() { return element; }
    public Node<T> getNext() { return next; }

    public void setElement(T elt){ element = elt; }
    public void setNext(Node<T> n) { next = n; }

}    
