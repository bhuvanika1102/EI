// SimpleTextEditor.java
public class SimpleTextEditor implements TextEditor {
    private String content;

    public SimpleTextEditor(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
