package com.designpatterns.behavioral.state;

public class Gate {


   private GateState gateState;

    public Gate() {
        this.gateState = new CloseGateState(this);
    }


    public void enter() {

        this.gateState.enter();
    }

    public void pay() {

        this.gateState.pay();
    }

    public void payOK() {

        this.gateState.payOK();
    }

    public void payFailed() {

        this.gateState.payFailed();
    }



    public void changeState(GateState gateState) {

        this.gateState=gateState;

    }


}
