package com.designpatterns.behavioral.command;

public class LightCommand implements ICommand {

   private Light light;







   public LightCommand (Light light) {


       this.light=light;
   }

    @Override
    public void execute() {

       this.light.lightOn();


    }

    @Override
    public void unExecute() {

       this.light.lightOff();
    }
}
