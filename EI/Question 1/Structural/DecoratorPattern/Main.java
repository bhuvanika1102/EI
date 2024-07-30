// Main.java
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new SimpleTextEditor("Hello, world!");

        editor = new SpellCheckDecorator(editor);
        editor = new GrammarCheckDecorator(editor);
        editor = new AutoCompleteDecorator(editor);

        System.out.println(editor.getContent());
    }
}
