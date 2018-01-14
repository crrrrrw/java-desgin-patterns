package com.crw.study.command.example3;

public class Client {

    public static void main(String[] args) {
        // 接受者角色
        Light kichenLight = new Light("厨房");
        Light livingRoomLight = new Light("客厅");
        Stereo livingRoomStereo = new Stereo("客厅");

        // 命令具体实现角色
        Command kichenLightOff = new LightOffCommand(kichenLight);
        Command kichenLightOn = new LightOnCommand(kichenLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomStereoWithCdOn = new StereoOnWithCDCommand(livingRoomStereo);
        Command livingRoomStereoWithCdOff = new StereoOffWithCDCommand(livingRoomStereo);

        // 请求者（调用者）角色
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, kichenLightOn, kichenLightOff);
        remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(2, livingRoomStereoWithCdOn, livingRoomStereoWithCdOff);

        System.out.println(remoteControl.toString());

        // 调用相关命令
        remoteControl.onButtonWasPushed(0);
        remoteControl.undoBUttonWasPushed();

        remoteControl.offButtonWasPushed(0);
        remoteControl.undoBUttonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.undoBUttonWasPushed();

        remoteControl.offButtonWasPushed(1);
        remoteControl.undoBUttonWasPushed();

        remoteControl.onButtonWasPushed(2);
        remoteControl.undoBUttonWasPushed();

        remoteControl.offButtonWasPushed(2);
        remoteControl.undoBUttonWasPushed();

    }
}
