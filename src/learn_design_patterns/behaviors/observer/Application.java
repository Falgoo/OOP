package learn_design_patterns.behaviors.observer;

public class Application {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
        StatisticDisplay statisticsDisplay = new StatisticDisplay();

        weatherData.addObserver(currentDisplay);
        weatherData.addObserver(statisticsDisplay);

        weatherData.setMeasurements(75, 60, 30.4f);
        weatherData.setMeasurements(80, 65, 29.2f);

        weatherData.removeObserver(statisticsDisplay);

        weatherData.setMeasurements(78, 63, 29.8f);
    }
}
