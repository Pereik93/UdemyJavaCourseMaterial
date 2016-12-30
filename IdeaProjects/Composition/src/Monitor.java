/**
 * Created by perol on 02.06.2016.
 */
public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, Resolution nativeResolution, int size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.nativeResolution = nativeResolution;
        this.size = size;
    }

    public void drawPixlAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
