package nguyenxuannghia_20001954.lab11.command.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Switch {

    private List<Command> list;

    public Switch() {
        list = new ArrayList<>();
    }

    public void storeAndExecute(Command command) {
        list.add(command);
        command.execute();
    }

    public void reexecuteCommand() {
        for (Command i : list) {
            i.execute();
        }
    }
}
