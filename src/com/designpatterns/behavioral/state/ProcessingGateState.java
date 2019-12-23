package com.designpatterns.behavioral.state;

public class ProcessingGateState implements GateState {



    private Gate gate;


    public ProcessingGateState(Gate gate) {
        this.gate = gate;
    }





    @Override
    public void enter() {

        System.out.println("Please wait ..processing !!");

    }

    @Override
    public void pay() {

        System.out.println("please wait for pay method until processing finished");

    }

    @Override
    public void payOK() {

        System.out.println("Gate opened successfully");
        this.gate.changeState(new OpenGateState(this.gate));

    }

    @Override
    public void payFailed() {

        System.out.println("Your payment Failed after processing");
        this.gate.changeState(new CloseGateState(this.gate));


    }
}
