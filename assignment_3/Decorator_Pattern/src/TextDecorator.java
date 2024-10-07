public abstract class TextDecorator implements TextEditor {
    protected TextEditor editor;

    public TextDecorator(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public String write() {
        return editor.write();
    }
}