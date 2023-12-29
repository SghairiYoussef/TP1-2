public class MallardDuck extends Duck implements Flyable, Quackable
{

    public void display()
    {
        System.out.println("MallardDuck");
    }
    public void fly()
    {
        System.out.println("I can fly");
    }
    public void quack()
    {
        System.out.println("Quack Quack");
    }
}