package nguyenxuannghia_20001954.lab11.command.exercise3;

public class TextDocument {

    private StringBuilder content;

    public TextDocument() {
        this.content = new StringBuilder();
    }

    public void insertText(String text, int position) {
        content.insert(position, text);
    }

    public void deleteText(int position, int length) {
        content.delete(position, position + length);
    }

    public String getText() {
        return content.toString();
    }

    public String getText(int position, int length) {
        return content.substring(position, position + length);
    }
}

