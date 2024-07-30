// Main.java
public class Main {
    public static void main(String[] args) {
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configManager2 = ConfigurationManager.getInstance();

        configManager1.displayConfiguration();
        configManager2.displayConfiguration();

        System.out.println(configManager1 == configManager2); // true
    }
}
