public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        ((Flyable) sparrow).fly();
        Bird penguin = new Penguin();
        penguin.eat();
    }
}