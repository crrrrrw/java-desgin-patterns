package com.crw.study.command.example2;

/**
 * 播放命令
 * 具体命令角色
 */
public class PlayCommand implements Command {

    private AudioPlayer myAudio;

    public PlayCommand(AudioPlayer audioPlayer) {
        myAudio = audioPlayer;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        myAudio.play();
    }

    @Override
    public void undo() {

    }
}
