package com.zaychikov.collections_home_work;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;

import java.util.*;

public class ArraysExample {

    public static void main(String... args) {
        int[] intArray = new int[5];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;

        ElementsCollection selenideElements = Selenide.$$("");

        List<String> stringList = new ArrayList<>();
        stringList.add("firstElement");
        stringList.add("secondElement");
        stringList.add("lastElement");
        stringList.remove(1);
        stringList.removeAll(stringList);
        System.out.println(stringList);

        List<Integer> intList = new ArrayList<>();
        intList.add(0);
        intList.add(10);
        intList.add(100);
        intList.forEach(System.out::println);

        List<String> stringFirstName = Arrays.asList("Jame");
        List<String> stringSecondName = Collections.singletonList("Jame");
        System.out.println(stringFirstName + " " + stringSecondName);
        List<String> stringLastName = new ArrayList<>(List.of("Jame", "Jame2"));
        System.out.println(stringLastName);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        for (int element : intArray) {
            System.out.println(element);
        }
    }

    static List<Integer> returnListIfArgumentGreaterThen0(int i) {
        if (i > 0) {
            return Arrays.asList(i);
        }
        return Collections.emptyList();
    }
}
