package learn_design_patterns.creational.singleton;

public class Configuration {

    private static Configuration uniqueInstance;
    private String configFile;

    private Configuration(String configFile) {
        this.configFile = configFile;
    }

    public static Configuration getInstance(String configFile) {
        if (uniqueInstance == null) {
            uniqueInstance = new Configuration(configFile);
        }
        return uniqueInstance;
    }

    public void setConfigFile(String configFile) {
        this.configFile = configFile;
    }

    public String getConfigFile() {
        return configFile;
    }
}
