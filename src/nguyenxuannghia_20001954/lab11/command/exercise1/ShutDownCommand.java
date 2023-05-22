package nguyenxuannghia_20001954.lab11.command.exercise1;

public class ShutDownCommand implements Command {

    private Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.shutDown();
    }
}
