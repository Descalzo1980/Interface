public class Dog extends Animal implements CanRun{
    @Override
    public String eat() {
        System.out.println("�����");
        return null;
    }

    public void run(){
        System.out.println("������ �����");
    }
}
