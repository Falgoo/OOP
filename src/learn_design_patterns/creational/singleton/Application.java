package learn_design_patterns.creational.singleton;

public class Application {

    public static void main(String[] args) {
        String fileConfig = "Config file";
        Configuration configuration = Configuration.getInstance(fileConfig);
        System.out.println(configuration.getConfigFile());

        configuration.setConfigFile("Not config file");
        System.out.println(configuration.getConfigFile());
    }
}
