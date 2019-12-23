package com.designpatterns.behavioral.iterator;

public class HandHeldInventory implements Inventory {


    private Item rightHand;

    private Item leftHand;




    @Override
    public IteratorInventory getIterator() {
        return new HandHeldItemIterator(this);
    }


    public Item getRightHand() {
        return rightHand;
    }

    public void setRightHand(Item rightHand) {
        this.rightHand = rightHand;
    }

    public Item getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Item leftHand) {
        this.leftHand = leftHand;
    }
}
