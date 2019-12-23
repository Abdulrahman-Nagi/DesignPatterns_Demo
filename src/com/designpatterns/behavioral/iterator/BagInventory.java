package com.designpatterns.behavioral.iterator;

import java.util.List;

public class BagInventory implements Inventory {

    private List<Item> bagItems;





    @Override
    public IteratorInventory getIterator() {
        return new BagIterator(this);
    }


    public List<Item> getBagItems() {
        return bagItems;
    }

    public void setBagItems(List<Item> bagItems) {
        this.bagItems = bagItems;
    }
}
