package learn_design_patterns.behaviors.mediator;

public class User {

    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String message) {
        chatMediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}
