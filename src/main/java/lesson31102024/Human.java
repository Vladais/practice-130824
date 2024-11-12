package lesson31102024;


public class Human extends Creature implements Walkable {

    public Human(String name) {
        super(name);
    }

    public void feedCat(Cat cat) {
        System.out.println("Human " + getName() + " feeds the cat " + cat.getName());
        cat.feed();
    }

    public void feedCat(Cat[] cats) {
        for (Cat cat : cats) {
            feedCat(cat);
        }
    }

    public void walk(Animal animal) {
        System.out.println(animal.getName() + " is walking");
        animal.setHungry(true);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I'm a Human. My name is " + super.getName());
    }

}

