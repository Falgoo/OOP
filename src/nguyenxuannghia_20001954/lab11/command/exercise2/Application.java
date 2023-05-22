package nguyenxuannghia_20001954.lab11.command.exercise2;

public class Application {

    protected String clipboard;
    protected Editor[] editors;
    protected Editor activeEditor;
    protected CommandHistory history = new CommandHistory();

    public void createUI() {
        activeEditor = new Editor("Ctr + C");
        executeCommand(new CopyCommand(this, activeEditor));

        activeEditor = new Editor("Ctr + X");
        executeCommand(new CutCommand(this, activeEditor));

        activeEditor = new Editor("Ctr + V");
        executeCommand(new PasteCommand(this, activeEditor));

        activeEditor = new Editor("Ctr + Z");
        executeCommand(new UndoCommand(this, activeEditor));

    }

    public void executeCommand(Command command) {
        if(command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.createUI();
        System.out.println(app.clipboard);

        app.executeCommand(new CutCommand(app, app.activeEditor));
        System.out.println(app.clipboard);

        app.executeCommand(new UndoCommand(app, app.activeEditor));
        System.out.println(app.clipboard);
    }
}
