package com.zaychikov.collections_home_work;

public enum Windows {

    OPEN("Открыть окно"),
    CLOSE("Закрыть окно"),
    MAX_SIZE("Развернуть на весь экран"),
    MIN_SIZE("Свернуть окно");

    private String windowName;

    Windows(String windowName) {
        this.windowName = windowName;
    }

    public String getWindowName() {
        return windowName;
    }
}
