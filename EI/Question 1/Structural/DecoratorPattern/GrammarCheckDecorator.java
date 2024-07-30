// GrammarCheckDecorator.java
public class GrammarCheckDecorator extends TextEditorDecorator {
    public GrammarCheckDecorator(TextEditor editor) {
        super(editor);
    }

    @Override
    public String getContent() {
        return editor.getContent() + " [GrammarChecked]";
    }
}
