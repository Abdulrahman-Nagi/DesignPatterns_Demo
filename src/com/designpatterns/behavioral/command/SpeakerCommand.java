package com.designpatterns.behavioral.command;

public class SpeakerCommand implements ICommand {

    Speaker speaker;



    public SpeakerCommand (Speaker speaker) {

        this.speaker=speaker;

    }




    @Override
    public void execute() {

        speaker.sayWelcome();

    }

    @Override
    public void unExecute() {

        speaker.sayBye();
    }
}
