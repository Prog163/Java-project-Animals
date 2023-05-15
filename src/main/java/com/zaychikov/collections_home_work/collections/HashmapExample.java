package com.zaychikov.collections_home_work.collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

    public static void main(String[] args) {

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
    }
}
