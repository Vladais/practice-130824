package lesson31102024;

public class Robot extends Creature implements Walkable, CatchingSkills {

    private String description;
    private int version;
    private static int totalRobotCount = 0;

    private static final int ROBOT_DEFAULT_VERSION = 1;

    public Robot(String name, String description) {
        super(name);
        this.description = description;
        this.version = ROBOT_DEFAULT_VERSION;
        totalRobotCount++;
    }

    public void printCurrentRobotInfo() {
        System.out.println(this);
    }

    public static void printTotalRobotCount() {
        System.out.println("Total robot count: " + totalRobotCount);
    }
    public void walk(Animal animal) {
        System.out.println(animal.getName() + " is walking");
        animal.setHungry(true);
    }


    @Override
    public String toString() {
        return "Robot{" +
                "name='" + getName() + '\'' +
                ", description='" + description + '\'' +
                ", version=" + version +
                '}';
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I'm Robot. My name is " + super.getName());
    }

    @Override
    public void catchMouse() {
        System.out.println("I am robot! I also can catch a mouse");
    }
}
