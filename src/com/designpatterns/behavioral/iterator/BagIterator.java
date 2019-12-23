package com.designpatterns.behavioral.iterator;

public class BagIterator implements IteratorInventory {

    private BagInventory bagInventory;

    private int index=0;

    public BagIterator(BagInventory bagInventory) {
        this.bagInventory=bagInventory;
    }



    @Override
    public boolean isDone() {
        while (index < this.bagInventory.getBagItems().size()) {

            return true;

        }

        return false;
    }



    @Override
    public void next() {

        this.index +=1;

    }

    @Override
    public Item getCurrentItem() {
        return this.bagInventory.getBagItems().get(this.index);
    }
}
