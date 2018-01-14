package com.crw.study.command.example2;

import java.util.ArrayList;
import java.util.List;

public class MacroAudioCommand implements MacroCommand {
    private List<Command> commandList = new ArrayList<Command>();

    /**
     * 宏命令聚集管理方法
     */
    @Override
    public void add(Command cmd) {
        commandList.add(cmd);
    }

    /**
     * 宏命令聚集管理方法
     */
    @Override
    public void remove(Command cmd) {
        commandList.remove(cmd);
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        System.out.println("macro command ---> start");
        for (Command cmd : commandList) {
            cmd.execute();
        }
        System.out.println("macro command ---> end");
    }

    @Override
    public void undo() {

    }
}
