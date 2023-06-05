package learn_design_patterns.behaviors.mementor;

public class DocumentMemento {

    private String content;

    public DocumentMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
