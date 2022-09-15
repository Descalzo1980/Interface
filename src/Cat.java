public class Cat extends Animal implements CanRun{
    @Override
    public String eat() {
        System.out.println("Вискас");
        return null;
    }

    public void run(){
        System.out.println("Кот бежит");
    }
}
