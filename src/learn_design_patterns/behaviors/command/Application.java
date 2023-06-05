package learn_design_patterns.behaviors.command;

public class Application {

    public static void main(String[] args) {

        Light lightLiving = new Light("living");
        Light lightBedroom = new Light("bedroom");

        Command livingRoomOn = new LightOnCommand(lightLiving);
        Command livingRoomOff = new LightOffCommand(lightLiving);
        Command lightBedroomOn = new LightOnCommand(lightBedroom);
        Command lightBedroomOff = new LightOffCommand(lightBedroom);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightBedroomOn);
        remoteControl.pressButton();

        Fan fanLiving = new Fan("living");
        Fan fanBedroom = new Fan("bedroom");

        Command fanLivingOn = new FanOnCommand(fanLiving);
        Command fanLivingOff = new FanOnCommand(fanLiving);
        Command fanBedroomOn = new FanOnCommand(fanBedroom);
        Command fanBedroomOff = new FanOnCommand(fanBedroom);
        Command fanBedroomAdjusting = new FanAdjustingCommand(fanBedroom);

        remoteControl.setCommand(fanLivingOn);
        remoteControl.pressButton();

        remoteControl.setCommand(fanBedroomAdjusting);
        remoteControl.pressButton();
        remoteControl.setCommand(fanBedroomAdjusting);
        remoteControl.pressButton();
    }
}
