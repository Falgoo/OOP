package learn_design_patterns.structural.bridge;

public class Client {

    public static void main(String[] args) {
        Device tv = new Radio(10, false);
        Remote remote = new Remote(tv);
        System.out.println(tv);
        remote.togglePower();
        System.out.println(tv);
        remote.volumeUp();
        remote.chanelUp();
        System.out.println(tv);
        AdvancedRemote remote2 = new AdvancedRemote(tv);
        remote2.mute();
        System.out.println(tv);
    }
}
