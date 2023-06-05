package learn_design_patterns.behaviors.mediator;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
