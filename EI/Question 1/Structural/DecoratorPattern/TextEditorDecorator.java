// TextEditorDecorator.java
public abstract class TextEditorDecorator implements TextEditor {
    protected TextEditor editor;

    public TextEditorDecorator(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public abstract String getContent();
}
