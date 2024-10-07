public class LinuxRenderer implements Renderer {
    @Override
    public void renderShape(String shape) {
        System.out.println("Rendering " + shape + " on Linux.");
    }
}