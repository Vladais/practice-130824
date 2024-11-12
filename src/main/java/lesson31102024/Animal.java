package lesson31102024;

public abstract class Animal extends Creature{

    private String colour;
    private int age;
    private boolean isHungry;


    public Animal(String name, String colour, int age, boolean isHungry) {
        super(name);
        this.colour = colour;
        this.age = age;
        this.isHungry = isHungry;
    }

    public Animal(String name) {
        super(name);
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void feed() {
        isHungry = false;
        System.out.println(this.getClass().getSimpleName() + " " + getName() + " is not hungry anymore");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " { " +
                "name='" + getName() + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                '}';
    }
}
