package com.designpatterns.behavioral.command;

public class Invoker {

    ICommand speaker;
    ICommand light;


        public Invoker (ICommand speaker,ICommand light) {

           this.speaker=speaker;
           this.light=light;
        }


        public void clickWelcome() {

            this.speaker.execute();
        }

        public void clickBye() {

            this.speaker.unExecute();
        }

        public void clickLightOn(){

            this.light.execute();
        }

        public void clickLightOff() {

            this.light.unExecute();
        }


        public void testAll() {

            this.light.execute();

            this.speaker.execute();

            this.speaker.unExecute();

            this.light.unExecute();



        }


}
