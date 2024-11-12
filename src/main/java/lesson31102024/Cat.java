package lesson31102024;

public class Cat extends Animal implements CatchingSkills {

    public Cat(String name, String colour, int age, boolean isHungry) {
        super(name, colour, age, isHungry);
    }

    public Cat(String name) {
        super(name, "white", 1, true);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I'm cat. My name is " + super.getName());
        meow();
    }

    public void run(){
        System.out.println("Cat is running!");
    }

    @Override
    public void play(Creature another) {
       if (another instanceof Dog) {
           run();
       } else {
        super.play(another);}
    }

    public void meow() {
        System.out.println("meow!");
    }

    @Override
    public void catchMouse() {
        System.out.println("I am cat! I can catch a mouse");
    }
}