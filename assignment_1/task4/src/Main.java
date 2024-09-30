public class Main {
    public static void main(String[] args) {
        Workable humanWorker = new HumanWorker();
        Workable robotWorker = new RobotWorker();
        humanWorker.work();
        ((Eatable) humanWorker).eat();
        robotWorker.work();
    }
}