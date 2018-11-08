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
public class LinkedQueue {

    private Node head, tail, temp;
    private int qSize;

    public LinkedQueue() {
        head = null;
        tail = null;
        temp = null;
        qSize = 0;
    }

    // accessor methods
    public int size() {
        return qSize;
    }

    public Object getTail() {
        Object obj;

        obj = tail.getElement();

        return obj;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public Object front()
            throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is Empty");
        } else {
            return head.getElement();
        }
    }

    public Object back()
            throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is Empty");
        } else {
            return tail.getElement();
        }
    }

    void clearQueue() {
        head = tail = null;
        qSize = 0;

    }

    public String get() {
        Node tempHead = head;
        String queue = "";
        int size = qSize;
        if(isEmpty() || size == 0){
          throw new QueueEmptyException("Queue is Empty");  
        }
        else{
            while(size >0 ){
                queue += tempHead.getElement() + " ,";
                tempHead = tempHead.getNext();
                size--;
            }
            return queue;
        }
     
    }
    public String getCurrent() {
        Node temp = head;
        String tempQueue= "";
        tempQueue += temp.getElement();
        temp = temp.getNext();
        return tempQueue;
     
    }

    public class QueueEmptyException extends RuntimeException {

        public QueueEmptyException(String err) {
            super(err);
        }
    }

    public Object serve() throws QueueEmptyException // Remove the first object from the queue
    {
        Object obj;
        if (qSize == 0) {
            throw new QueueEmptyException("Queue is empty.");
        } else {
            obj = head.getElement();
            head = head.getNext();
            qSize--;
        }
        if (qSize == 0) {
            tail = null; // the queue is now empty
        }
        return obj;
    }

    public Object serveTail() throws QueueEmptyException // Remove the first object from the queue
    {
        Object obj;
        if (qSize == 0) {
            throw new QueueEmptyException("Queue is empty.");
        } else {
            obj = tail.getElement();
            
            qSize--;
        }
        
        return obj;
    }

    public void append(Object obj) // insert an element 
    {
        Node node = new Node();
        node.setElement(obj);
        node.setNext(null);     	// node will be new tail node
        if (qSize == 0) {
            head = node;      	 // empty queue
            temp = head;
        } else {
            tail.setNext(node); // add node at the tail of the list
        }
        tail = node;    // update the reference to the tail node
        qSize++;
    }

}
