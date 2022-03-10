package com.healthcare.starter.demo;

import java.util.ArrayList;
import java.util.List;

public class Parent {

    private List<Child> children = new ArrayList<>();

    public void add(Child child) {
        if(!this.children.contains(child)) {
            this.children.add(child);
        }
    }

    public Child get(int index) {
        if(this.children.size() >= index) {
            throw new ArrayIndexOutOfBoundsException("Invalid index.");
        }
        return this.children.get(index);
    }

}
