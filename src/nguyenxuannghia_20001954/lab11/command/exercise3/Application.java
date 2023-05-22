package nguyenxuannghia_20001954.lab11.command.exercise3;

public class Application {

    public static void main(String[] args) {
        TextDocument document = new TextDocument();
        TextEditor editor = new TextEditor();

        editor.executeCommand(new InsertCommand(document, "Hello ", 0));
        editor.executeCommand(new InsertCommand(document, "world!", 6));

        System.out.println(document.getText()); // Output: Hello world!

        editor.undo();
        System.out.println(document.getText()); // Output: Hello

        editor.redo();
        System.out.println(document.getText()); // Output: Hello world!
    }
}
