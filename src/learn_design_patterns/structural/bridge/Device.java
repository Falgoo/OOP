package learn_design_patterns.structural.bridge;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int volume);
    int getChanel();
    void setChanel(int chanel);
}
