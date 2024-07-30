// AutoCompleteDecorator.java
public class AutoCompleteDecorator extends TextEditorDecorator {
    public AutoCompleteDecorator(TextEditor editor) {
        super(editor);
    }

    @Override
    public String getContent() {
        return editor.getContent() + " [AutoCompleted]";
    }
}
