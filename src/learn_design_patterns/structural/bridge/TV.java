package learn_design_patterns.structural.bridge;

public class TV implements Device {

    private int chanel;
    private boolean enable;
    private int volume;

    public TV(int chanel) {
        this.chanel = chanel;
        enable = false;
        volume = 50;
    }

    public TV(int chanel, boolean enable) {
        this.chanel = chanel;
        this.enable = enable;
        volume = 50;
    }

    @Override
    public boolean isEnabled() {
        return enable;
    }

    @Override
    public void enable() {
        enable = true;
    }

    @Override
    public void disable() {
        enable = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChanel() {
        return chanel;
    }

    @Override
    public void setChanel(int chanel) {
        this.chanel = chanel;
    }

    @Override
    public String toString() {
        return "TV{" +
                "chanel=" + chanel +
                ", enable=" + enable +
                ", volume=" + volume +
                '}';
    }
}
