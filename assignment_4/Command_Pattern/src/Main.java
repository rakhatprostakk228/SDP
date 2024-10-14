public class Main {
    public static void main(String[] args) {
        // Create the receiver
        Light livingRoomLight = new Light();

        // Create the commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Create the invoker
        RemoteControl remote = new RemoteControl();

        // Turn the light ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn the light OFF
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}