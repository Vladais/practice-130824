package lesson31102024;

public class House {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        tom.sayHello();
        tom.feed();
        System.out.println(tom);

        Robot robot1 = new Robot("Vacuum cleaner", "Robot to clean the house");
        robot1.printCurrentRobotInfo();
        Robot robot2 = new Robot("Washing machine", "Robot to wash something");
        robot2.printCurrentRobotInfo();
        Robot.printTotalRobotCount();
        robot1.sayHello();

        Human human = new Human("Mark");
        human.feedCat(tom);
        human.sayHello();

        Dog dog = new Dog("Tuzik");
        dog.bark();
        dog.sayHello();
        dog.feed();

        human.walk(dog);
        System.out.println(dog);

        dog.play(tom);
        tom.play(human);
        tom.play(dog);
        robot1.play(robot2);

        robot1.walk(dog);
        human.walk(tom);

        tom.catchMouse();
        robot1.catchMouse();
    }
}
