/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Samuel
 */

public class Node {
    private Object element;// element stored here
    private Node next;//reference stored here to next in list
    
    // constructors
    public Node() 
    {
        this(null,null);
    }

    public Node(Object e, Node n) 
    {
        element = e;
        next = n;
    }
    public void setElement(Object newElem)
    {
    element = newElem;
    }

    public void setNext(Node newNext) 
    {
        next = newNext;
    }

    public Object getElement() 
    {
        return element;
    }

    public Node getNext() 
    {
        return next;
    }
}
