class App {
    public static void main(String[] args) throws Exception {
        Duck D= new DecoyDuck();
        D.display();
        
        Duck D1= new RubberDuck();
        D1.display();
        ((RubberDuck)D1).quack();

        Duck D2 = new MallardDuck();
        D2.display();
        ((MallardDuck)D2).fly();
        ((MallardDuck)D2).swim();
        ((MallardDuck)D2).quack();

        Duck D3 = new RedheadDuck();
        D3.display();
        ((RedheadDuck)D3).fly();
        ((RedheadDuck)D3).quack();
    }
}
