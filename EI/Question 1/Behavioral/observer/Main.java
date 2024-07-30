// Main.java
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        DisplayUnit display1 = new DisplayUnit("Display 1");
        DisplayUnit display2 = new DisplayUnit("Display 2");

        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        weatherStation.setMeasurements(25.5f, 65.0f, 1013.0f);
        weatherStation.setMeasurements(26.0f, 70.0f, 1012.0f);
    }
}
