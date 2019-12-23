package com.designpatterns.behavioral.strategy;

public class OperationSubtract implements Strategy {



    @Override
    public int doOperation(int num1, int num2) {

        int result =num1 - num2;

        System.out.println("Subtract Result = " + result);

        return result;
    }
}
