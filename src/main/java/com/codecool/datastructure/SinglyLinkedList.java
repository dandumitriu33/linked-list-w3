package com.codecool.datastructure;

import java.util.LinkedList;

public class SinglyLinkedList extends LinkedList {



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

    // Returns the number at 'index'./home/dan/codecool/oop/w3/linked-list-w3
    public int access(int index) {
//        if (index==0) {
//            return head.getValue();
//        }
        Link temp;
        temp = (Link) this.get(index);


        return temp.getValue();
    }

    // Returns the index of 'number' if it's in the array, otherwise -1;
    public int search(int number) {
        Link lookingAt;
        for (int i=0; i<this.size(); i++) {
            lookingAt = (Link) this.get(i);
            if (lookingAt.getValue() == number) return i;
        }
        return -1;
    }

    // Inserts 'number' at 'index' into the array shifting elements if necessary.
    //
    // e.g. the result of inserting 42 at index 3 into [0, 1, 2, 3, 4] is [0, 1, 2, 42, 3, 4]
    public void insert(int index, int number) {
        Link temp = new Link(number);
        this.add(index, temp);
    }

    // Deletes the element at 'index' from the array.
    //
    //  e.g. the result of deleting index 2 from [0, 1, 2, 3, 4] is [0, 1, 3, 4]
    public void delete(int index) {
        this.remove(index);
    }
}
