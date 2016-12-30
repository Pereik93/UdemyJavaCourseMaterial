/**
 * Created by perol on 01.06.2016.
 */
public class Car {

    private int doors;
    private int wheel;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("")){
            System.out.println("Model can not be empty");
        }
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }

}
