package nguyenxuannghia_20001954.lab11.bridge.exercise2;

public class App {

    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote1 = new RemoteControl(tv);
        remote1.togglePower();
        remote1.channelUp();
        System.out.println(tv.getChannel());

        remote1.volumeUp();
        System.out.println(tv.getVolume());

        Device radio = new Radio();
        RemoteControl remote2 = new AdvancedRemoteControl(radio);
    }
}
