package nguyenxuannghia_20001954.lab11.command.exercise2;

public class UndoCommand extends Command {

    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.undo();
        return false;
    }
}
