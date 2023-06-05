package learn_design_patterns.behaviors.mementor;

public class Document {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public DocumentMemento createDocumentMemento() {
        return new DocumentMemento(content);
    }

    public void restoreFromMemento(DocumentMemento documentMemento) {
        content = documentMemento.getContent();
    }
}
