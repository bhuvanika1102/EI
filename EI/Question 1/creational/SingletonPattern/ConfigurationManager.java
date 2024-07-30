// ConfigurationManager.java
public class ConfigurationManager {
    private static ConfigurationManager instance;

    private ConfigurationManager() {
        // Private constructor to prevent instantiation
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public void displayConfiguration() {
        System.out.println("Configuration settings displayed.");
    }
}
