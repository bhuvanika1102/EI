// DisplayUnit.java
public class DisplayUnit implements Observer {
    private String name;

    public DisplayUnit(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println(name + " Display - Temperature: " + temperature + ", Humidity: " + humidity + ", Pressure: "
                + pressure);
    }
}
