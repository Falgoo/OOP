package nguyenxuannghia_20001954.lab11.command.exercise3;

import java.util.ArrayDeque;
import java.util.Deque;

public class TextEditor {

    private Deque<Command> undoStack;
    private Deque<Command> redoStack;

    public TextEditor() {
        undoStack = new ArrayDeque<>();
        redoStack = new ArrayDeque<>();
    }

    public void executeCommand(Command command) {
        command.execute();
        undoStack.push(command);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            command.execute();
            undoStack.push(command);
        }
    }
}
