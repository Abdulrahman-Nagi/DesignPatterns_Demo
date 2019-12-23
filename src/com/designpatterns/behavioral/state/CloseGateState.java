package com.designpatterns.behavioral.state;

public class CloseGateState implements GateState {


    private Gate gate;


    public CloseGateState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {

        System.out.println("Sorry Gate closed please pay first to enter it");

    }

    @Override
    public void pay() {
        System.out.println("Please wait processing");

        this.gate.changeState(new ProcessingGateState(this.gate));

    }

    @Override
    public void payOK() {


        System.out.println("null pay ok");



    }

    @Override
    public void payFailed() {

        System.out.println("null pay failed");

    }
}
