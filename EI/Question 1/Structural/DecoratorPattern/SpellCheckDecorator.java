// SpellCheckDecorator.java
public class SpellCheckDecorator extends TextEditorDecorator {
    public SpellCheckDecorator(TextEditor editor) {
        super(editor);
    }

    @Override
    public String getContent() {
        return editor.getContent() + " [SpellChecked]";
    }
}
