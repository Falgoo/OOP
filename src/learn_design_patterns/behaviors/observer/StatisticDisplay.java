package learn_design_patterns.behaviors.observer;

public class StatisticDisplay implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "StatisticDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
