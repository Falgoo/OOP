package learn_design_patterns.behaviors.command;

public class Fan {

    private String location;
    private String mode;

    public Fan(String location) {
        this.location = location;
        mode = "normal";
    }

    public void turnOn() {
        System.out.println("Fan-"+location+" is turn on");
    }

    public void turnOff() {
        System.out.println("Fan-"+location+" is turn off");
    }

    public void adjusting() {
        switch (this.mode) {
            case "normal" -> this.mode = "medium";
            case "medium" -> this.mode = "high";
            case "high" -> this.mode = "normal";
        }
        getMode();
    }

    public void getMode() {
        System.out.println("Fan-"+location+" is mode " + mode);
    }
}
