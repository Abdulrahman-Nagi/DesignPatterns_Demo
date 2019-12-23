package com.designpatterns.behavioral.state;

public interface GateState {

    void enter();
    void pay();
    void payOK();
    void payFailed();
}
