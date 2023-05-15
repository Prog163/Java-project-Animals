package com.zaychikov.collections_home_work.enum_classes;

public class EnumExample {

    public static void main(String[] args) {
        Windows[] window = Windows.values();
        for (Windows windows : window) {
            System.out.println(windows.name() + ": " + windows.getWindowName());
        }
    }
}
