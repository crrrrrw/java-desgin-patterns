package com.crw.study.command.example1;

public class Invoker {

    /**
     * 持有命令对象
     */
    private Command command = null;

    public Invoker() {
    }

    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 行动方法
     */
    public void action() {
        command.execute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
