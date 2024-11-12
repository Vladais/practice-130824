package lesson31102024;

public class Dog extends Animal {

    public Dog(String name, String colour, int age, boolean isHungry) {
        super(name, colour, age, isHungry);
    }

    public Dog(String name) {
        super(name, "black", 1, true);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! My name is " + super.getName());
        bark();
    }
    public void play(Creature another) {
        if (another instanceof Cat) {
            bark();
        } else {
            super.play(another);
        }
    }

    public void bark() {
        System.out.println("bark!");
    }
}
