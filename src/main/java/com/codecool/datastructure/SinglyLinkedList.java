package com.codecool.datastructure;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SinglyLinkedList {



    private class Link {

        private int value;
        private Link next;

        Link(int value) {
            this.value = value;
        }

        int getValue() {
            return value;
        }

        Link getNext() {
            return next;
        }

        void setNext(Link next) {
            this.next = next;
        }
    }

    private Link head;

    public SinglyLinkedList() {

    }

    private List<Integer> numbers = new LinkedList<>();


    // Adds a new element to the linked list
    public int add(int i) {
        head = new Link(i);
        return head.getValue();
    }

    // Returns the number at 'index'./home/dan/codecool/oop/w3/linked-list-w3
    public int access(int index) {
        System.out.println("entered access");
        System.out.println("index is: " + index);
        ListIterator<Integer> iter = numbers.listIterator();
        for (int i=0; i<=index; i++) {
            System.out.println("i counter at: " + i);
            System.out.println(head.getValue());
        }

//        for (int counter = 0; counter < index; counter++) {
//            if (counter==index-1) {
//                head.next.value = head.getValue();
//            }
//            else {
//                iter.next();
//                head.next.value = head.getValue();
//            }
//        }

        return head.getValue();
    }

    // Returns the index of 'number' if it's in the array, otherwise -1;
    public int search(int number) {
        return 0;
    }

    // Inserts 'number' at 'index' into the array shifting elements if necessary.
    //
    // e.g. the result of inserting 42 at index 3 into [0, 1, 2, 3, 4] is [0, 1, 2, 42, 3, 4]
    public void insert(int index, int number) {
    }

    // Deletes the element at 'index' from the array.
    //
    //  e.g. the result of deleting index 2 from [0, 1, 2, 3, 4] is [0, 1, 3, 4]
    public void delete(int index) {
        if (index == 0) {
            if (head == null) {
                throw new IndexOutOfBoundsException();
            } else {
                head = head.getNext();
            }
            return;
        }
        Link elementBeforeIndex = head;
        while (index - 1 > 0) {
            elementBeforeIndex = elementBeforeIndex.getNext();
            index--;
            if (elementBeforeIndex == null) {
                throw new IndexOutOfBoundsException();
            }
        }
        Link elementAtIndex = elementBeforeIndex.getNext();
        if (elementAtIndex == null) {
            throw new IndexOutOfBoundsException();
        }
        elementBeforeIndex.setNext(elementAtIndex.getNext());
    }
}
