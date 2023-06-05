package learn_design_patterns.behaviors.command;

public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void turnOn() {
        System.out.println("Light-"+location + " is turn on");
    }

    public void turnOf() {
        System.out.println("Light-"+location+"is turn of");
    }
}
