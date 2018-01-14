package com.crw.study.command.example2;

/**
 * 暂停命令
 * 具体命令角色
 */
public class StopCommand implements Command {

    private AudioPlayer myAudio;

    public StopCommand(AudioPlayer audioPlayer) {
        myAudio = audioPlayer;
    }

    @Override
    public void execute() {
        myAudio.stop();
    }

    @Override
    public void undo() {

    }

}
