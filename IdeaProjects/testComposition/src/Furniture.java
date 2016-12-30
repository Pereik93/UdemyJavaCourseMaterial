/**
 * Created by perol on 02.06.2016.
 */
public class Furniture {

    private String color;
    private int size;
    private int weight;

    public Furniture(String color, int size, int weight) {
        this.color = color;
        this.weight = weight;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
