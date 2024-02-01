package aula4boundedwildcards.problema4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> myIntegerList = new ArrayList<>();
        List<Double> myDoubleList = new ArrayList<>();
        List<Object> myObjectList = new ArrayList<>();

        myIntegerList.add(1);
        myIntegerList.add(2);
        myIntegerList.add(3);
        // Ou
        myDoubleList = Arrays.asList(0.0, 1.0, 2.0, 3.0);

        List<Object> newlist = copy(myIntegerList, myObjectList,myDoubleList);

        System.out.println(newlist.toString());
    }

    public static List<? super Object> copy(List<? extends Number> integerList, List<? super Object> myObjectList, List<? extends Number> doubleList) {
        for (Number number : integerList) {
            myObjectList.add(number);
        }

        for (Number number : doubleList) {
            myObjectList.add(number);
        }
        return myObjectList;
    }
}
