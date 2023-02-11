package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {

        ArrayList<String> sourceArrayList = new ArrayList<>(sourceList);
        sourceArrayList.add (0, "");

        ArrayList<String> listOfStrings = new ArrayList<>();

        for (String element : sourceArrayList) {

            int indexOfElement = sourceArrayList.indexOf(element);

            if (indexOfElement != 0 && indexOfElement % 3 == 0) {

                listOfStrings.add(element);
                listOfStrings.add(element);
            }
        }

        return listOfStrings;
    }
}
