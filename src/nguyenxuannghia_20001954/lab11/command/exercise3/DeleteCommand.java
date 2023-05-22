package nguyenxuannghia_20001954.lab11.command.exercise3;

public class DeleteCommand implements Command {

    private TextDocument document;
    private String deletedText;
    private int position;

    public DeleteCommand(TextDocument document, int position, int length) {
        this.document = document;
        this.position = position;
        this.deletedText = document.getText(position, length);
    }

    @Override
    public void execute() {
        document.deleteText(position, deletedText.length());
    }

    @Override
    public void undo() {
        document.insertText(deletedText, position);
    }
}

