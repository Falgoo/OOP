package learn_design_patterns.behaviors.mementor;

import java.util.Stack;

public class History {

    private Stack<DocumentMemento> mementos = new Stack<>();

    public void save(DocumentMemento documentMemento) {
        mementos.push(documentMemento);
    }

    public DocumentMemento undo() {
        if (!mementos.isEmpty()) {
            mementos.pop();
            return mementos.get(mementos.size()-1);
        }
        return null;
    }
}
