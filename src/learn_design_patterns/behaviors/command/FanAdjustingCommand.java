package learn_design_patterns.behaviors.command;

public class FanAdjustingCommand implements Command {

    private Fan fan;

    public FanAdjustingCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.adjusting();
    }
}
