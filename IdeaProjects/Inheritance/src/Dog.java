/**
 * Created by perol on 02.06.2016.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }



    //Overriding super class (Animal)
    @Override
    public void eat() {
        System.out.println("Dog.eat()called");
        chew();
        super.eat();
    }

    private void chew(){
        System.out.println("Dog.chew() was called");
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }


    public void walk(){
        System.out.println("Dog.walk() called");
        // The super keyword makes us call the move method in Animal,
        // which is the superclass of Dog
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        super.move(10);
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("Dog.move() called");
        moveLegs(speed);
    }
}
