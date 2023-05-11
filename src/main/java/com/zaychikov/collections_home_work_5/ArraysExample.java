package com.zaychikov.collections_home_work_5;

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

        Set<String> stringSet = new HashSet<>();
        stringSet.add("BOOM");
        stringSet.add("BAM");
        stringSet.add("OU");
        stringSet.add("Carabum");
        stringSet.remove("BOOM");
        System.out.println(stringSet.stream().sorted());

        Set<String> linkedStringSet = new LinkedHashSet<>();
        linkedStringSet.addAll(stringSet);

        Set<String> treeStringSet = new TreeSet<>();
        treeStringSet.add("F");
        treeStringSet.add("A");
        treeStringSet.add("C");
        treeStringSet.add("M");
        treeStringSet.add("P");
        System.out.println(treeStringSet);

        Map<Integer, String> numbersMap = new HashMap<>();
        numbersMap.put(1, "A");
        numbersMap.put(2, "B");
        numbersMap.put(3, "C");
        numbersMap.put(4, "D");
        numbersMap.replace(1, "A", "B");
        numbersMap.get(1);
        System.out.println(numbersMap.containsKey(5));
        System.out.println(numbersMap.values());
        System.out.println(numbersMap.keySet());
        System.out.println(numbersMap.entrySet());

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
