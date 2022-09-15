public class Dog extends Animal implements CanRun{
    @Override
    public String eat() {
        System.out.println("Кость");
        return null;
    }

    public void run(){
        System.out.println("Собака бежит");
    }
}
