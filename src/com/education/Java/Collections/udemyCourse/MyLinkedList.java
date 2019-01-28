package com.education.Java.Collections.udemyCourse;

import java.util.Arrays;

/**
 * Created by Serhii Hildi on 27.11.18.
 */
public class MyLinkedList {


    /**
     * Реализация односвязного списка LinkedList
     */
    private Node head;
    private int size;

    public void add(int value){
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    @Override
    public String toString() {
        int[] result = new int[size];

        int idx = 0;
        Node temp = head;

        while (temp != null){
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(123);
        list.add(1123512);
        list.add(512);
        list.add(1);

        System.out.println(list);
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}