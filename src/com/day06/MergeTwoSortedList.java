package com.day06;

import com.day05.LinkedList;
import com.day05.Node;

public class MergeTwoSortedList {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(1);
        list1.appendNode(2);
        list1.appendNode(4);
        list1.appendNode(5);
        list1.appendNode(8);

        LinkedList<Integer> list2 = new LinkedList<>(3);
        list2.appendNode(3);
        list2.appendNode(6);
        list2.appendNode(7);
        list2.appendNode(8);

        LinkedList<Integer> mergedList = mergeTwoSortedList(list1.getHead(), list2.getHead());
    }

    public static LinkedList<T> mergeTwoSortedList(LinkedList l1, LinkedList l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        if (l1.getData() < l2.getData()) {
            l1.setNext(mergeTwoSortedList(l1.getNext(), l2));
            return l1;
        } else {
            l2.setNext(mergeTwoSortedList(l1, l2.getNext()));
            return l2;
        }

    }
}
