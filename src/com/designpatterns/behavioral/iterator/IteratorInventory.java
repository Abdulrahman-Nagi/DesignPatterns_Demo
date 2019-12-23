package com.designpatterns.behavioral.iterator;

public interface IteratorInventory {

    boolean isDone();

    void next();

    Item getCurrentItem();


}
