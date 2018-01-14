package com.crw.study.command.example2;

/**
 * 倒带命令
 * 具体命令角色
 */
public class RewindCommand implements Command {

    private AudioPlayer myAudio;

    public RewindCommand(AudioPlayer audioPlayer) {
        myAudio = audioPlayer;
    }

    @Override
    public void execute() {
        myAudio.rewind();
    }

    @Override
    public void undo() {

    }

}
