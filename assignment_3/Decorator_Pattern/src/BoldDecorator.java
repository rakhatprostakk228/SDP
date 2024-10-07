public class BoldDecorator extends TextDecorator {
    public BoldDecorator(TextEditor editor) {
        super(editor);
    }

    @Override
    public String write() {
        return "<b>" + super.write() + "</b>";
    }
}