package nguyenxuannghia_20001954.lab11.iterator.exercise2;

public class Application {

    public SocialNetwork network;
    public SocialSpammer spammer;

    public void config() {
        this.network = new Facebook();
        Profile person1 = new Profile("1", "hoangvannam@gmail.com");
        Profile person2 = new Profile("2", "duongvanmai@gmail.com");
        Profile person3 = new Profile("3", "hoangthidung.com");
        Profile person4 = new Profile("4", "lethuthuy@gmail.com");
        ((Facebook) network).add(person1, "friends");
        ((Facebook) network).add(person2, "coworkers");
        ((Facebook) network).add(person3, "friends");
        ((Facebook) network).add(person4, "coworkers");

        spammer = new SocialSpammer();
        System.out.println("Send spam to friends");
        sendSpamToFriends(person3);

        System.out.println("Send spam to coworkers");
        sendSpamToCoworkers(person4);
    }

    public void sendSpamToFriends(Profile profile) {
        ProfileIterator iterator = network.createFriendsIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }

    public void sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = network.createCoworkersIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.config();
    }
}
