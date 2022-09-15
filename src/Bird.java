public class Bird extends Animal implements CanRun, Flyable{
    @Override
    public String eat() {
        System.out.println("«ерно");
        return null;
    }

    @Override
    public void run() {
        System.out.println("ѕтица бежит");
    }

    @Override
    public void fly() {
        System.out.println("I believe i can fly");
    }
}
