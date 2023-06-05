package learn_design_patterns.behaviors.mediator;

public class Application {

    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new User("User1", chatRoom);
        User user2 = new User("User2", chatRoom);
        User user3 = new User("User3", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi there!");
    }
}
