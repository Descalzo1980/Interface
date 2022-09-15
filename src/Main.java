import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        Bird bird = new Bird();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(fish);
        animals.add(bird);
        for (Animal animal : animals) {
            animal.eat();
        }

        Dog dog1 = new Dog();
        dog1.run();
        Animal animal = dog1;
        dog1 = (Dog) animal;
        dog1.run();
    }
}
