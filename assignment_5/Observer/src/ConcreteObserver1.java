public class ConcreteObserver1 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer 1 received update: " + message);
    }
}