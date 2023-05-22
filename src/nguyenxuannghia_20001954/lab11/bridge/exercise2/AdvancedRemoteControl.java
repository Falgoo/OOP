package nguyenxuannghia_20001954.lab11.bridge.exercise2;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    void mute() {
        device.setVolume(0);
    }
}
