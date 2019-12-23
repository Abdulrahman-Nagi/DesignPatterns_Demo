package com.designpatterns.behavioral.iterator;

public class HandHeldItemIterator implements IteratorInventory {


    private HandHeldInventory handHeldInventory;

    int index=0;

    public HandHeldItemIterator(HandHeldInventory handHeldInventory) {
        this.handHeldInventory=handHeldInventory;
    }

    @Override
    public boolean isDone() {
        return this.index <2;
    }

    @Override
    public void next() {

        this.index +=1;

    }

    @Override
    public Item getCurrentItem() {


        switch (this.index) {

            case 0 : return this.handHeldInventory.getRightHand();

            case  1 : return this.handHeldInventory.getLeftHand();

            default: return null;
        }
    }
}
