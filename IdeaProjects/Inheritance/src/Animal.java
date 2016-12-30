/**
 * Created by perol on 02.06.2016.
 */
public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;


    public Animal(String name, int brain, int body, int size, int weight) {
        System.out.println(name + " brain: " +brain);
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public Animal() {
    this("Unknown Species", 0, 0, 0, 0);

    }

    public void eat(){
        System.out.println("Animal.eat() was called");
    }

    public void move(int speed){
        System.out.println("Animal is moving at: " + speed);

    }



    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
