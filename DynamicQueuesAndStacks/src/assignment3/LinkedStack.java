/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Sam
 */
public class LinkedStack {

    private Node top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Object obj) {
        Node n = new Node();
        n.setElement(obj);
        n.setNext(top);
        top = n;
        size++;
    }

    public Object pop() //throws StackException
    {
        Object temp;
        if (isEmpty()) //throw new StackException("Stack is empty.")
        {
            System.out.println("Stack is empty");
        }
        temp = top.getElement();
        top = top.getNext();
        size--;
        return temp;
    }

    public Object top() {
        if (isEmpty()) { //throw new StackException("Stack is empty.");
            return "Stack is empty.";
        }
        return top.getElement();
    }

    public boolean searchStack(Object st) {
        Node current = top;
        while (current != null) {
            if (current.getElement().equals(st)) {

                return true;
            }
            current = current.getNext();

        }

        return false;

    }

    void clearStack() {
        int temp = size;
        for (int i = 0; i < temp; i++) {
            top = top.getNext();
            size--;

        }
    }

    String printStack() {
        Node current = top;
        String obj = "";
        if (isEmpty() || size <= 0) {
            obj = "Stack is empty.";
            return obj;
        }
        while (current != null) {
            obj += ("Location: " + size + " : " + current.getElement() + " | ");
            current = current.getNext();
            size--;
        }
        return obj;
    }

}

