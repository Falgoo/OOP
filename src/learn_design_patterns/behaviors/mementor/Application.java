package learn_design_patterns.behaviors.mementor;

public class Application {

    public static void main(String[] args) {
        Document document = new Document();
        History history = new History();

        document.setContent("first version");
        history.save(document.createDocumentMemento());

        document.setContent("second version");
        history.save(document.createDocumentMemento());

        System.out.println(document.getContent());

        DocumentMemento previousMemento = history.undo();
        if (previousMemento != null) {
            document.restoreFromMemento(previousMemento);
        }
        System.out.println(document.getContent());

    }
}
