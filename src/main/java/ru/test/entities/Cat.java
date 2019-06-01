package ru.test.entities;

import org.springframework.stereotype.Component;

public class Cat {
    public String name = "cat";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
