public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(TextEditor editor) {
        super(editor);
    }

    @Override
    public String write() {
        return "<i>" + super.write() + "</i>";
    }
}