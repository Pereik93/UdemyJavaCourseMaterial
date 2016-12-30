/**
 * Created by perol on 02.06.2016.
 */
public class Main {

    public static void main(String[] args){
        Animal animal = new Animal();

        Dog dog = new Dog("YorkiE", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();

       // dog.walk();
        dog.run();

    }
}
