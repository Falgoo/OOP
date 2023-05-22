package nguyenxuannghia_20001954.lab11.command.exercise3;

public class InsertCommand implements Command {

    private TextDocument document;
    private String text;
    private int position;

    public InsertCommand(TextDocument document, String text, int position) {
        this.document = document;
        this.text = text;
        this.position = position;
    }

    @Override
    public void execute() {
        document.insertText(text, position);
    }

    @Override
    public void undo() {
        document.deleteText(position, text.length());
    }
}
