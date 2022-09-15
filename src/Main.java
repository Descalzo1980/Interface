import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        CanRun canRun = dog;
        dog = (Dog) canRun;
        dog.eat();
        dog.run();
        Flyable flyable = new Bird();
        flyable.fly();

    }
}
