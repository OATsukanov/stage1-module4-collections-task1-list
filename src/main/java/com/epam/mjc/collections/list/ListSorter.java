package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {

        sourceList.sort(new ListComparator());

    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        int result = 0;

        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);

        int intAByMod = Math.abs(intA);
        int intBByMod = Math.abs(intB);

        if (intAByMod > intBByMod) {
            result = 1;
        } else if (intAByMod < intBByMod) {
            result = -1;
        } else {

            if (intA > intB) {
                result = 1;
            } else if (intA < intB) {
                result = -1;
            }
        }

        return result;
    }
}
