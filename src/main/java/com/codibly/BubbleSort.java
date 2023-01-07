package com.codibly;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public List<Comparable> sort(List<Comparable> input) {
        if (input == null)
            throw new RuntimeException("Input cannot be null!");
        List<Comparable> cleanList = getListWithoutNullElements(input);
        return doBubbleSort(cleanList);
    }

    private List<Comparable> getListWithoutNullElements(List<Comparable> input) {
        List<Comparable> cleanList = new ArrayList<>();
        for (Comparable element : input) {
            if (element != null)
                cleanList.add(element);
        }
        return cleanList;
    }

    private List<Comparable> doBubbleSort(List<Comparable> input) {
        Comparable temp;
        for (int i = 0; i < input.size() - 1; i++) {
            for (int j = 0; j < input.size() - i - 1; j++) {
                if (compareElements(input.get(j), input.get(j + 1)) > 0) {
                    temp = input.get(j + 1);
                    input.set(j + 1, input.get(j));
                    input.set(j, temp);
                }
            }
        }
        return input;
    }

    private int compareElements(Comparable e1, Comparable e2) {
        double num1 = Double.parseDouble(e1.toString());
        double num2 = Double.parseDouble(e2.toString());
        return Double.compare(num1, num2);
    }
}
