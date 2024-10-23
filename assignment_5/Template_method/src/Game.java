public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // Шаблонный метод
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}