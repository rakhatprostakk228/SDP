public class Main {
    public static void main(String[] args) {
        ComputerPart keyboard = new Keyboard();
        ComputerPart monitor = new Monitor();
        ComputerPart mouse = new Mouse();

        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();
        keyboard.accept(visitor);
        monitor.accept(visitor);
        mouse.accept(visitor);
    }
}