package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {

        LinkedList<Integer> listOfIntegers = new LinkedList<>();

        for (int integer : sourceList) {

            if (integer % 2 == 0) {

                listOfIntegers.addLast(integer);
            } else {
                listOfIntegers.addFirst(integer);
            }
        }

        return listOfIntegers;
    }
}
