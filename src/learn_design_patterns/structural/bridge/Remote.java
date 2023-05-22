package learn_design_patterns.structural.bridge;

public class Remote {

    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    public void chanelDown() {
        device.setChanel(device.getChanel() - 1);
    }

    public void chanelUp() {
        device.setChanel(device.getChanel() + 1);
    }

    public Device getDevice() {
        return device;
    }
}
