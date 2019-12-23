package com.designpatterns.behavioral.state;

public class OpenGateState implements GateState {


    private Gate gate;


    public OpenGateState(Gate gate) {
        this.gate = gate;
    }




    @Override
    public void enter() {

        System.out.println("Welcome you entered the Gate");

        this.gate.changeState(new CloseGateState(this.gate));

    }

    @Override
    public void pay() {

        System.out.println("Pay do nothing in Open State");

    }

    @Override
    public void payOK() {

        System.out.println("Paying Success but Gate already opened !");

    }

    @Override
    public void payFailed() {

        System.out.println("Paying Failed but Gate Opened and you can enter throw it");
    }
}
